package it.scuccimarri.spring5webapp.repositories;

import it.scuccimarri.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
