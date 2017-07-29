package at.alexnavratil.skeleton.controllers;

import at.alexnavratil.skeleton.models.Person;
import at.alexnavratil.skeleton.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {
    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Person> index(){
        return personRepository.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public Person add(@RequestBody Person addPerson){
        return personRepository.save(addPerson);
    }
}
