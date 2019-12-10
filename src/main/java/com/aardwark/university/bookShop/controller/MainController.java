package com.aardwark.university.bookShop.controller;

import com.aardwark.university.bookShop.model.Book;
import com.aardwark.university.bookShop.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping(path = "/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        Book savedBook = bookRepository.save(book);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedBook).toUri();

        return ResponseEntity.created(location).build();
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
