package it.scuccimarri.spring5webapp.repositories;

import it.scuccimarri.spring5webapp.domain.*;
import org.springframework.data.repository.*;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
