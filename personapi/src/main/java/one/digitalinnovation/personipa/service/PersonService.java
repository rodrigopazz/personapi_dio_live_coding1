package one.digitalinnovation.personipa.service;

import one.digitalinnovation.personipa.dto.MessageResponseDTO;
import one.digitalinnovation.personipa.entity.Person;
import one.digitalinnovation.personipa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Create person with ID" + savedPerson.getId())
                .build();
    }
}
