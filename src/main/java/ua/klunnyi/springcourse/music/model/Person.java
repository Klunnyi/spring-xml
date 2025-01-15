package ua.klunnyi.springcourse.music.model;

import lombok.Data;

@Data
//@RequiredArgsConstructor
public class Person {

    private String name;
    private int age;

    public Person (String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
