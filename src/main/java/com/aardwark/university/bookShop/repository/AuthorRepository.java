package com.aardwark.university.bookShop.repository;

import com.aardwark.university.bookShop.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
