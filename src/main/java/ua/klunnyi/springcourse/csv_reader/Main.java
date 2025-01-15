package ua.klunnyi.springcourse.csv_reader;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.klunnyi.springcourse.csv_reader.service.AppService;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("/context.xml");
        AppService bean = context.getBean(AppService.class);
        bean.start();
    }
}
