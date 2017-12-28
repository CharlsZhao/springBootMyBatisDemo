package com.boot.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.model.Book;
import com.boot.service.BookService;

@Controller
public class LoginController {

    @Autowired
    private BookService bookService;
    
    @RequestMapping("login")
    public String login(Model model) {

        List<Book> bookList = bookService.allBooks();

        model.addAttribute("bookList", bookList);
        model.addAttribute("hello", "hello World!");

        return "login/login";
    }
}
