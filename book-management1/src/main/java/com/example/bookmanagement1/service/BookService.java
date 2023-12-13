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

    public BookDTO updatePartialDTO(int id, BookPartialDTO dto) {
        Book originalBook = bookRepository.getByID(id);
        Book book = bookRepository.update(id, updateMapper(originalBook, dto)); //tai sao k fai la updateParitial
        return new BookDTO(book.getId(),book.getName(),book.getDescription());
    }

    public void delete(int id){
        bookRepository.deleteByID(id);
    }

    public Book updateMapper(Book originalBook, BookPartialDTO dto) {
        Book bookUpdated = new Book();
        bookUpdated.setId(originalBook.getId());
        if(dto.getName() == null) { // cả cục optional null
            bookUpdated.setName(originalBook.getName());
            if(dto.getDescription().isPresent()) { // hay là id null
                bookUpdated.setDescription(dto.getDescription().get());
            } else {
                bookUpdated.setDescription(null);
            }
        }
        if(dto.getDescription() == null) {
            bookUpdated.setDescription(originalBook.getDescription());
            if(dto.getName().isPresent()) {
                bookUpdated.setName(dto.getName().get());
            } else {
                bookUpdated.setName(null);
            }
        }
        if(dto.getName() != null && dto.getDescription() != null) {
            if(dto.getName().isPresent()) {
                bookUpdated.setName(dto.getName().get());
            } else {
                bookUpdated.setName(null);
            }
            if(dto.getDescription().isPresent()) {
                bookUpdated.setDescription(dto.getDescription().get());
            } else {
                bookUpdated.setDescription(null);
            }
        }
        if(dto.getName() == null && dto.getDescription() == null) {
            bookUpdated.setName(originalBook.getName());
            bookUpdated.setDescription(originalBook.getDescription());
        }
        return bookUpdated;
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
