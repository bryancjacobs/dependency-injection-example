package example.repo;

import example.model.Person;

/**
 * Created by bjacobs on 3/1/17.
 */
public class PersonRepo {
    public Person getById(Integer id) {
        return new Person(id);
    }
}
