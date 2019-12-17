package com.aardwark.university.bookShop.controller;

import com.aardwark.university.bookShop.model.Author;
import com.aardwark.university.bookShop.model.Book;
import com.aardwark.university.bookShop.model.BookCategory;
import com.aardwark.university.bookShop.model.BookType;
import com.aardwark.university.bookShop.repository.AuthorRepository;
import com.aardwark.university.bookShop.repository.BookCategoryRepository;
import com.aardwark.university.bookShop.repository.BookRepository;
import com.aardwark.university.bookShop.repository.BookTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Locale;
import java.util.Optional;

@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainController {

    @Autowired
    private BookTypeRepository bookTypeRepository;

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @PostMapping(path = "/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        Book savedBook = bookRepository.save(book);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedBook).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping(path = "/book/types")
    public Iterable<BookType> getAllTypes(){
        return bookTypeRepository.findAll();
    }

    @GetMapping(path = "/book/categories")
    public Iterable<BookCategory> getAllCategories(){
        return bookCategoryRepository.findAll();
    }

    @GetMapping(path = "book/authors")
    public Iterable<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    @GetMapping(path = "/books")
    public Iterable<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @GetMapping(path = "/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable long id){
        Optional<Book> foundBook = bookRepository.findById(id);

        if(foundBook.isPresent()){
            return ResponseEntity.ok().body(foundBook.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
