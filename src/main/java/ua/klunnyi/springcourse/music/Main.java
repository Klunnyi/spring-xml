package ua.klunnyi.springcourse.music;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.klunnyi.springcourse.music.model.Person;
import ua.klunnyi.springcourse.music.service.PersonService;

public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("/context.xml");
        PersonService personService = context.getBean(PersonService.class);
        Person john = personService.getByName("John", 60);
        System.out.println(john);

//        ClassicalMusic musicBean1 = context.getBean("musicBean1", ClassicalMusic.class);
//        ClassicalMusic musicBean2 = context.getBean("musicBean1", ClassicalMusic.class);
//
//        System.out.println(musicBean1 == musicBean2);

//      Music music = context.getBean("classicalMusic", Music.class);

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//
//        System.out.println(firstMusicPlayer == secondMusicPlayer);

//        System.out.println(firstmMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(666);
//        System.out.println(secondMusicPlayer.getVolume());

        context.close();
    }
}
