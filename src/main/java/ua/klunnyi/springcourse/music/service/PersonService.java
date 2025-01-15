package ua.klunnyi.springcourse.music.service;

import ua.klunnyi.springcourse.music.model.Person;

public interface PersonService {
    Person getByName(String name, int age);
}
