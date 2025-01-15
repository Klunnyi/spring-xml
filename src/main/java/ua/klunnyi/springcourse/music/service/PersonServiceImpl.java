package ua.klunnyi.springcourse.music.service;

import ua.klunnyi.springcourse.music.dao.PersonDao;
import ua.klunnyi.springcourse.music.model.Person;

public class PersonServiceImpl implements PersonService {

    private PersonDao personDao;
    private Integer rez;

    public PersonServiceImpl(PersonDao personDao, Integer rez) {
        this.personDao = personDao;
        this.rez = rez;
    }

    @Override
    public Person getByName(String name, int age) {
        return personDao.findByName(name, age-this.rez);
    }
}
