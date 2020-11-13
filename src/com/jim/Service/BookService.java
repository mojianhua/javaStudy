package com.jim.Service;

import com.jim.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    /**
     * 结账：传入哪个用户买哪本书
     * */
    @Transactional
    public void checkOut(String username,String isbn){
        //1、减库存
        bookDao.updateStock(isbn);
        //获取价格
        double price = bookDao.getPrice(isbn);
        //减额度
        bookDao.updateBalance(username,price);
    }

    /**
     * 事务细节：
     * isolation-Isolation:事务隔离级别
     * Spring定义了7种传播行为
     * REQUIRED：如果事务在运行，当前的方法就在这个事务内运行，否则就启动一个新的事务，并在自己的事务内运行
     * REQUIRED_NEW：当前的方法必须启动新的事务，并在它自己的事务内运行，如果有事务正在运行，应该将他挂起
     * SUPPORTS：如果有事务在运行，当前的方法就在这个事务运行，否则它可以不运行在事务中
     * NOT_SUPPORTS：当前的方法不应该运行在事务中，如果有运行的事务将他挂起
     * NEVER：当前的方法不应该运行在事务中，如果有运行的事务，就抛出异常
     * NESTED：如果有事务在运行，当前的方法就应该在这个事务的嵌套事务中运行，否则就启动一个新的事务，并在它自己的事务内运行
     *
     *
     * propagation-Propagation:事务的传统行为
     *
     * 隔离级别：
     * 读未提交：READ UNCOMMITTED
     *          1、会造成脏读
     * 读已提交：READ COMMITTED
     *          1、可以避免脏读，但是避免不可重复读，
     *             如在同一方法中，当提交后，再次读取，就会造成不同的结果
     * 可重复读：REPEATABLE READ
     *          1、只要在同一个事务中，（快照读），第一次是什么，以后就是什么，即使外界的数据都没了
     * 串行化：SERIALIZABLE
     * 修改Mysql隔离级别
     * SET [SESSION | GLOBAL] TRANSACTION ISOLATION {READ UNCOMMITTED | READ COMMITTED |}
     * 如：SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;
     *
     * 查询Mysql的隔离级别
     * SELECT @@global.tx_isolation; //查询全局隔离级别
     * SELECT @@session.tx_isolation: //查询当前会话隔离级别
     *
     * 事务操作
     * 开启事务：start transaction;
     * 提交事务：commit;
     * 回滚事务：rollback;
     *
     * 错误信息：java.lang.ArithmeticException: / by zero
     * noRollbackFor-Class[]:哪些异常事务可以不回滚
     * noRollbackForClassName-String[]:（String全类名）
     * rollbackFor-Class[]:哪些异常事务需要回滚
     * rollbackForClassName-String[]:
     *
     * 异常分类：
     *      运行异常（非检查异常）：可以不用处理，默认回滚：
     *      编译时异常（检查异常）：要么try-catch，要么在声明throws默认不回滚
     *  事务的回滚：默认发生运行是异常都回滚，发生编译时异常不会回滚
     *
     *
     * readOnly-boolean:只读：设置只读事务：
     *      可进行事务优化：
     *      readOnly=true:加快查询速度：不用管事务那一堆操作
     * timeout-int:超时时间设置,事务超出指定执行时长后自动终止并回滚
     * */
//    @Transactional(timeout = 3,readOnly = false,noRollbackFor = {ArithmeticException.class},rollbackFor = {FileNotFoundException.class})
    @Transactional(propagation = Propagation.REQUIRED)
    public void checkOutNew(String username,String isbn){
        //1、减库存
        bookDao.updateStock(isbn);
        //获取价格
        double price = bookDao.getPrice(isbn);

//        //设置超时时间
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }


        //减额度
        bookDao.updateBalance(username,price);

        //int i = 10/0;
        try {
            FileInputStream fileInputStream  = new FileInputStream("D://wwwww.txt");
        }catch (FileNotFoundException e){
            System.out.println("文件不存在");
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void updatePrice(String isbn,double price){
        bookDao.updatePrice(isbn,price);
    }

    /**
     * 事务隔离级别
     * 事务隔离级别——READ-COMMITTED（读已提交）
     * */
    @Transactional(readOnly = true,isolation = Isolation.READ_COMMITTED)
    public double getPrice(String isbn){
        return bookDao.getPrice(isbn);
    }
}
