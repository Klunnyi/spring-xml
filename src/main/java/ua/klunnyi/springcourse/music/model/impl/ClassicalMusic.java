package ua.klunnyi.springcourse.music.model.impl;

import ua.klunnyi.springcourse.music.model.Music;

/**
 * @author Serhii Klunniy
 */
public class ClassicalMusic implements Music {

    private static Music instance;

    private ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public static Music getInstance() {

        return new ClassicalMusic();
    }
}
