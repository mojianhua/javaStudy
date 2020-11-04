package com.jim.Service;

import com.jim.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
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
     * propagation-Propagation:事务的传统行为
     *
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
    @Transactional(timeout = 3,readOnly = false,noRollbackFor = {ArithmeticException.class},rollbackFor = {FileNotFoundException.class})
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

    /**
     * 事务隔离级别
     * 事务隔离级别——READ-COMMITTED（读已提交）
     * */
    @Transactional(readOnly = true,isolation = Isolation.READ_COMMITTED)
    public double getPrice(String isbn){
        return bookDao.getPrice(isbn);
    }
}
