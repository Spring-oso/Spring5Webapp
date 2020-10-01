package it.scuccimarri.spring5webapp.controllers;

import it.scuccimarri.spring5webapp.repositories.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookControllers {

    private final BookRepository bookRepository;

    public BookControllers(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Call http://localhost:8080/books
    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());

        // This is the template in the directory resources/templates
        return "books/list";
    }
}
