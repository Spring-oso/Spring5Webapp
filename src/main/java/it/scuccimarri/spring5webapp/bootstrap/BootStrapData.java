package it.scuccimarri.spring5webapp.bootstrap;

import it.scuccimarri.spring5webapp.domain.Author;
import it.scuccimarri.spring5webapp.domain.Book;
import it.scuccimarri.spring5webapp.repositories.AuthorRepository;
import it.scuccimarri.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// This is a Spring Managed component
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // Create the entities
        Author author = new Author("Marco", "Rossi");
        Book book = new Book("Harry Potter e la pietra filosofale", "123456789");

        // Create the relationships
        author.getBooks().add(book);
        book.getAuthors().add(author);

        // These repositories save in H2 database (In the pom you can see the dependency)
        authorRepository.save(author);
        bookRepository.save(book);

        // Create the entities
        Author michele = new Author("Michele", "Verdi");
        Book springBook = new Book("Spring in Action", "789456123");

        // Create the relationships
        author.getBooks().add(springBook);
        book.getAuthors().add(michele);

        // These repositories save in H2 database (In the pom you can see the dependency)
        authorRepository.save(michele);
        bookRepository.save(springBook);

        // Print the result
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
}
