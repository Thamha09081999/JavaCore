package com.example.bookmanagement1.controller;


import com.example.bookmanagement1.model.BookDTO;
import com.example.bookmanagement1.model.BookPartialDTO;
import com.example.bookmanagement1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("{bookId}")
    public BookDTO getById (@PathVariable("bookId")int id){
        return bookService.getById(id);
    }

    @PostMapping()
    public BookDTO create(@RequestBody BookDTO bookDTO){
        return bookService.create(bookDTO);
    }

//    @GetMapping()
//    public ArrayList <BookDTO>  getListBook ( ){
//        return bookService.getListBook();
//    }

    @PutMapping("{bookId}")
    public BookDTO update (@PathVariable("bookId") int id, @RequestBody BookDTO bookDTO){
        return bookService.update(id,bookDTO);
    }

    @PatchMapping("{bookId}")
    public BookDTO update(@PathVariable("bookId") int id, @RequestBody BookPartialDTO dto){
        return bookService.updatePartialDTO(id,dto);
    }
}
