package com.example.bookmanagement1.service;

import com.example.bookmanagement1.entity.Book;
import com.example.bookmanagement1.model.BookDTO;
import com.example.bookmanagement1.model.BookPartialDTO;
import com.example.bookmanagement1.reponsitory.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookService {

    private BookRepository bookRepository ;

    @Autowired
    public BookService (BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public BookDTO getById(int id){
       Book book = bookRepository.getByID(id);
       return new BookDTO(book.getId(), book.getName(), book.getDescription());

    }

    public BookDTO create(BookDTO bookDTO){
        Book book = bookRepository.create(new Book(bookDTO.getId(), bookDTO.getName(), bookDTO.getDescription()));
        return new BookDTO(book.getId(),book.getName(),book.getDescription());
    }

    public BookDTO update(int id, BookDTO bookDTO){
        Book book = bookRepository.update(id, new Book(bookDTO.getId(), bookDTO.getName(), bookDTO.getDescription()));
        return new BookDTO(book.getId(),book.getName(),book.getDescription());
    }

    public BookDTO updatePartialDTO(int id, BookPartialDTO dto){
        Book originalBook = bookRepository.getByID(id);
        Book bookUpdated = new Book();
        bookUpdated.setId(dto.getId().get());

        if (dto.getName() == null){
            bookUpdated.setName(originalBook.getName());
            bookUpdated.setDescription(dto.getDescription().get());
        }
        if (dto.getDescription() == null){
            bookUpdated.setDescription(originalBook.getDescription());
            bookUpdated.setName(dto.getName().get());
        }
        if(dto.getName() != null && dto.getDescription() != null) {
            bookUpdated.setName(dto.getName().get());
            bookUpdated.setDescription(dto.getDescription().get());
        }
        if(dto.getName() == null && dto.getDescription() == null){
            bookUpdated.setName(originalBook.getName());
            bookUpdated.setDescription(originalBook.getDescription());
        }
        Book book = bookRepository.update(id, bookUpdated);
        return new BookDTO(book.getId(),book.getName(),book.getDescription());
    }

//    public ArrayList <BookDTO> getListBook(){
//        ArrayList<Book> books = bookRepository.getListBook();
//        for (Book book:
//             books) {
//
//        }
//        return new ArrayList<BookDTO>();
//    }
}
