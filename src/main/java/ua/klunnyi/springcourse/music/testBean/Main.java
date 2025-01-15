package ua.klunnyi.springcourse.music.testBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("context.xml");
        TestBean springBean = context.getBean("springBean", TestBean.class);

        System.out.println(springBean);
    }
}
