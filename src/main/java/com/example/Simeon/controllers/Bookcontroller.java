package com.example.Simeon.controllers;

import com.example.Simeon.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bookcontroller {

    private final BookRepository bookRepository;

    public Bookcontroller(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books",bookRepository.findAll());

        return "books";
    }
}
