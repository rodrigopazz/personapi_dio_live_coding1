package one.digitalinnovation.personipa.controller;


import one.digitalinnovation.personipa.dto.MessageResponseDTO;
import one.digitalinnovation.personipa.entity.Person;
import one.digitalinnovation.personipa.repository.PersonRepository;
import one.digitalinnovation.personipa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vi/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }
}
