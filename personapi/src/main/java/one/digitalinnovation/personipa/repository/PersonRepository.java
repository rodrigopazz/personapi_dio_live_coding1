package one.digitalinnovation.personipa.repository;

import one.digitalinnovation.personipa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person, Long> {

}
