package com.jim.test;

import com.jim.Service.BookService;
import com.jim.Service.MulService;
import com.jim.bean.Employee;
import com.jim.dao.EmployeeDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jdbcTemplateTest {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("/conf/applicationJdbcTemplateContent.xml");
    JdbcTemplate jdbcTemplate = ioc.getBean(JdbcTemplate.class);
    //test07相关配置
    NamedParameterJdbcTemplate namedParameterJdbcTemplate = ioc.getBean(NamedParameterJdbcTemplate.class);

    /**
     * 通过名称和书名减额度
     * */
    @Test
    public void test10(){
        BookService bookService = ioc.getBean(BookService.class);
//        bookService.checkOut("jj1","b1");
//        bookService.checkOutNew("jj1","b1");
//        double price = bookService.getPrice("b1");
//        System.out.println(price);

        MulService mulService = ioc.getBean(MulService.class);
        mulService.mulTx();
    }

    /**
     * 实验9：创建EmployeeDao,自动装配JdbcTemplate对象
     * */
    @Test
    public void test09(){
        EmployeeDao bean = ioc.getBean(EmployeeDao.class);
        Employee employee = new Employee();
        //将所有具名参数的值都放到map中:
        employee.setEmpName("阿吉2号");
        employee.setSalary(1231.12);
        bean.saveEmployee(employee);
    }


    /**
     * 实验8：重复实验7，以SqlParameterSource形式传入参数值
     * */
    @Test
    public void test08(){
        String sql = "INSERT INTO employee(emp_name,salary) VALUES(:emp_name,:salary)";
        Employee employee = new Employee();
        //将所有具名参数的值都放到map中:
        employee.setEmpName("阿吉2号");
        employee.setSalary(1231.12);
        int i = namedParameterJdbcTemplate.update(sql,new BeanPropertySqlParameterSource(employee));
        System.out.println(i);
    }

    /**
     * 使用带有具名参数的SQL语句插入一条员工记录，并以MAP形式传入参数值
     * 具体参数：（具体名字的参数，参数是不是占位符，而是一个变量名）
     *      语法格式：参数名
     * String有一个支持具名参数功能的JdbcTemplate
     * 占位符参数：?的顺序千万不能乱，传参的时候一定要注意
     * */
    @Test
    public void test07(){
        String sql = "INSERT INTO employee(emp_name,salary) VALUES(:emp_name,:salary)";
        //Map
        Map<String,Object> paramMap = new HashMap<>();
        //将所有具名参数的值都放到map中:
        paramMap.put("emp_name","阿吉1号");
        paramMap.put("salary",998.98);
        int update = namedParameterJdbcTemplate.update(sql,paramMap);
        System.out.println(update);
    }


    /**
     * 查询最大salary
     * */
    @Test
    public void test06(){
        String sql = "select max(salary) FROM employee";
        //无论是返回单个数据还是单个对象，都用queryForObject
        Double object = jdbcTemplate.queryForObject(sql,Double.class);
        System.out.println(object);
    }

    /**
     * 查询salary > 10的数据封装List集合
     * */
    @Test
    public void test05(){
        String sql = "SELECT emp_id empId,emp_name empName,salary Salary FROM employee WHERE salary > ?";
        //封装List,集合里面元素的类型
        List<Employee> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Employee.class),10);
        for (Employee employee : list){
            System.out.println(employee);
        }
    }


    /**
     * 查询emp_id=5的数据，封装为一个java对象返回；
     * javaBean需要和数据库字段一致，否则无法完成封装；
     * */
    @Test
    public void test04(){
        String sql = "SELECT emp_id AS empId,emp_name AS empName,salary FROM employee WHERE emp_id=?";
        //RowMapper:每一行记录和javaBean的属性如何映射
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
        Employee employee = null;
        try {
            employee = jdbcTemplate.queryForObject(sql, rowMapper, 5);
        } catch (DataAccessException e){

        }
        System.out.println(employee);
    }


    @Test
    //批量插入
    public void test02() throws SQLException{
        String sql = "INSERT INTO employee(emp_name,salary) VALUES(?,?)";
        //List<Object[]>
        //List的长度就是sql执行的次数
        //Object[],每次执行要用的参数

        List<Object[]> batchArgs=new ArrayList<>();
        batchArgs.add(new Object[]{"张三",1200.1});
        batchArgs.add(new Object[]{"李四",1300.12});
        batchArgs.add(new Object[]{"王五",1400.13});
        batchArgs.add(new Object[]{"赵六",1500.3});
        int[] is = jdbcTemplate.batchUpdate(sql,batchArgs);
        for (int i : is){
            System.out.println(i);
        }
    }

    @Test
    //更新
    public void test01() throws SQLException{
        String sql = "UPDATE employee SET salary = ? WHERE emp_id = ?";
        //第一个是sql语句，后面的按着顺序传入参数即可，这个update方法是接收的可变参数！
        int update = jdbcTemplate.update(sql, 1302,1);
        System.out.println(update);
    }

    @Test
    //测试连接数据库
    public void test() throws SQLException {
        DataSource bean = ioc.getBean(DataSource.class);
        Connection connection = bean.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
