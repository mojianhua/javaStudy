package com.jim.test;

import com.jim.bean.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class jdbcTemplateTest {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("/conf/applicationJdbcTemplateContent.xml");

    JdbcTemplate jdbcTemplate = ioc.getBean(JdbcTemplate.class);


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
