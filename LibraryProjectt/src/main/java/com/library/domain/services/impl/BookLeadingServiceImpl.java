package com.library.domain.services.impl;


import com.library.domain.entities.BookLeading;
import com.library.domain.repositories.BookLeadingRepository;
import com.library.domain.services.BookLeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookLeadingServiceImpl implements BookLeadingService {

    @Autowired
    @Qualifier("bookLeadingRepository")
    private BookLeadingRepository bookLeadingRepository;

    @Override
    public BookLeading addBookLeading(BookLeading bookLeading) {
        BookLeading addBookLeading = bookLeadingRepository.saveAndFlush(bookLeading);

        return addBookLeading;
    }


    @Override
    public List<BookLeading> getAll() {
        return bookLeadingRepository.findAll();
    }


    @Override
    public void delete(long id) {
        bookLeadingRepository.delete(id);
    }
}
