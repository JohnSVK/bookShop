package com.aardwark.university.bookShop.controller;

import com.aardwark.university.bookShop.model.Author;
import com.aardwark.university.bookShop.model.Book;
import com.aardwark.university.bookShop.model.BookCategory;
import com.aardwark.university.bookShop.model.BookType;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MainControllerTest extends AbstractTest {

    @Override
    @Before
    public void setUp(){
        super.setUp();
    }

    @Test
    public void shouldReturnNonEmptyBookList() throws Exception {
        //GIVEN
        String uri = "/books";
        //WHEN
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
        .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        //THEN
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);

        String content = mvcResult.getResponse().getContentAsString();
        Book[] books;
        try {
            books = super.mapFromJson(content, Book[].class);
            assertTrue(books.length > 0);
        } catch(Exception e){
            fail("Exception while parsing json response occurred");
        }
    }

    @Test
    public void shouldReturnNonEmptyBookCategoryList() throws Exception {
        //GIVEN
        String uri = "/book/categories";
        //WHEN
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        //THEN
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);

        String content = mvcResult.getResponse().getContentAsString();
        BookCategory[] bookCategories;
        try {
            bookCategories = super.mapFromJson(content, BookCategory[].class);
            assertTrue(bookCategories.length > 0);
        } catch(Exception e){
            fail("Exception while parsing json response occurred");
        }
    }

    @Test
    public void shouldReturnNonEmptyBookTypeList() throws Exception {
        //GIVEN
        String uri = "/book/types";
        //WHEN
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        //THEN
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);

        String content = mvcResult.getResponse().getContentAsString();
        BookType[] items;
        try {
            items = super.mapFromJson(content, BookType[].class);
            assertTrue(items.length > 0);
        } catch(Exception e){
            fail("Exception while parsing json response occurred");
        }
    }

    @Test
    public void shouldReturnNonEmptyAuthorList() throws Exception {
        //GIVEN
        String uri = "/book/authors";
        //WHEN
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        //THEN
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);

        String content = mvcResult.getResponse().getContentAsString();
        Author[] items;
        try {
            items = super.mapFromJson(content, Author[].class);
            assertTrue(items.length > 0);
        } catch(Exception e){
            fail("Exception while parsing json response occurred");
        }
    }

}
