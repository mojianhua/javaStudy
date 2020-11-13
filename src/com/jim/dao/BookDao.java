package com.jim.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BookDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 1、减余额
     * */
    public void updateBalance(String userName,double price){
        String sql = "UPDATE account SET balance=balance-? WHERE username=?";
        jdbcTemplate.update(sql,price,userName);
    }

    /**
     * 按照图书的ISBN获取某本图书的价格
     * */
    public double getPrice(String isbn){
        String sql = "SELECT price FROM book WHERE isbn=?";
        return jdbcTemplate.queryForObject(sql,Double.class,isbn);
    }

    /**
     * 减库存：减去某本书库存，为了简单起见，每次减1
     * */
    public void updateStock(String isbn){
        String sql = "UPDATE book_stock SET stock=stock-1 WHERE isbn=?";
        jdbcTemplate.update(sql,isbn);
    }

    /**
     * 改图书价格
     * */
    @Transactional(propagation = Propagation.REQUIRED)
    public void updatePrice(String isbn,double price){
        String sql = "UPDATE book set price = ? where isbn = ?";
        jdbcTemplate.update(sql,price,isbn);
    }
}
