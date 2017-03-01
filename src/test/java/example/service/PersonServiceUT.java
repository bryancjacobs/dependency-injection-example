package example.service;

import example.model.Person;
import example.repo.PersonRepo;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bjacobs on 3/1/17.
 */
public class PersonServiceUT {

    @Test
    public void shouldGetPersonByGivenId(){
        PersonService personService = new PersonService(new PersonRepo());

        Assert.assertEquals(new Integer(1), personService.getById(1).getId());
    }

    @Test
    public void dependencyInjectionShouldAllowADifferentRepo() {
        PersonService personService = new PersonService(new PersonRepoMock());

        Assert.assertEquals(new Integer(999), personService.getById(1).getId());
    }

    class PersonRepoMock extends PersonRepo{

        // ignore incoming id and return the 999 value
        public Person getById(Integer id){
            return new Person(999);
        }
    }
}
