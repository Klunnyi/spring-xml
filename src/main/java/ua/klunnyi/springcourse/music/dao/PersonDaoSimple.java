package ua.klunnyi.springcourse.music.dao;

import ua.klunnyi.springcourse.music.model.Person;

public class PersonDaoSimple implements PersonDao {

    public Person findByName(String name, int age) {
        return new Person(name, age);
    }
}
