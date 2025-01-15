package ua.klunnyi.springcourse.music.dao;

import ua.klunnyi.springcourse.music.model.Person;

public interface PersonDao {

    Person findByName(String name, int age);
}
