package com.aardwark.university.bookShop.repository;

import com.aardwark.university.bookShop.model.BookCategory;
import org.springframework.data.repository.CrudRepository;

public interface BookCategoryRepository extends CrudRepository<BookCategory, Long> {
}
