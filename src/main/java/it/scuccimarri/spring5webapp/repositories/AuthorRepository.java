package it.scuccimarri.spring5webapp.repositories;

import it.scuccimarri.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
