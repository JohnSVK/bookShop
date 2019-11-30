package com.aardwark.university.bookShop.repository;

import com.aardwark.university.bookShop.model.BookType;
import org.springframework.data.repository.CrudRepository;

public interface BookTypeRepository extends CrudRepository<BookType, Long> {
}
