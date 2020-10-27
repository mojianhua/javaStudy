package com.jim.Service;

import com.jim.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
