package com.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.mapper.BookMapper;
import com.boot.model.Book;
import com.boot.service.BookService;

@Service
@Transactional
public class BookSericeImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> allBooks() {
        return bookMapper.selectAllUndeleted();
    }

}
