package com.jim.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MulService {

    @Autowired
    private BookService bookService;

    @Transactional
    public void mulTx(){
        bookService.checkOutNew("jj1","b1");

        bookService.updatePrice("b2",999.99);
    }
}
