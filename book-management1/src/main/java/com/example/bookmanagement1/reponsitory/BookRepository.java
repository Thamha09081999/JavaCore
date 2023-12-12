package com.example.bookmanagement1.reponsitory;

import com.example.bookmanagement1.entity.Book;
import com.example.bookmanagement1.model.BookPartialDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BookRepository {
    private static ArrayList<Book> books = new ArrayList<>();
    static {
        books.add(new Book(1,"Harry Porter","novel"));
        books.add(new Book(2,"Hat giong tam hon","van hoc"));
        books.add(new Book(3,"Dac nhan tam","skill"));
        books.add(new Book(4,"Cuon theo chieu gio","novel"));
    }

    public Book getByID(int id){
        for (Book book:books) {

            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }

    public Book create(Book book){
        books.add(book);
        return book;
    }
// Sai
//    public Book update(int id, Book book){
//        for(Book b:books){
//            if(b.getId() == id){
//                books.remove(b);
//                books.add(book);
//            }
//        }
//        return book;
//    }

    //update PUT
    public Book update (int id, Book book){
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                books.add(book);
            }
        }
        return book;
    }

    //update PATCH
    public Book updatePartial(int id, BookPartialDTO dto){
        Book book = new Book();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId() == id){
                if (dto.getName() == null){
                    book.setName(books.get(i).getName());
                    book.setDescription(dto.getDescription().get());
                }
                if (dto.getDescription() == null){
                    book.setDescription(books.get(i).getDescription());
                    book.setName(dto.getName().get());
                }
                if(dto.getName() != null && dto.getDescription() != null) {
                    book.setName(dto.getName().get());
                    book.setDescription(dto.getDescription().get());
                }
                if(dto.getName() == null && dto.getDescription() == null)
                    book.setName(books.get(i).getName());
                    book.setDescription(books.get(i).getDescription());
            }
            this.books.remove(i);
            this.books.add(book);
        }
        return book;
    }

    public ArrayList <Book> getListBook(){
        return books;
    }
}
