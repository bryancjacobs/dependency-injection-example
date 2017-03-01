package example.service;

import example.model.Person;
import example.repo.PersonRepo;

/**
 * Created by bjacobs on 3/1/17.
 */
public class PersonService {

    private PersonRepo personRepo;

    public PersonService(PersonRepo personRepo){
        this.personRepo = personRepo;
    }

    public Person getById(Integer id) {
        return personRepo.getById(id);
    }
}
