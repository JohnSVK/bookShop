package com.aardwark.university.bookShop.repository;

import com.aardwark.university.bookShop.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
