package ua.klunnyi.springcourse.csv_reader;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("/context.xml");
    }
}
