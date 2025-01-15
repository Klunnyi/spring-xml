package ua.klunnyi.springcourse.music.model.impl;

import ua.klunnyi.springcourse.music.model.Music;

/**
 * @author Serhii Klunniy
 */
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wing cries Marry";
    }
}
