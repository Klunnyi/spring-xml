package ua.klunnyi.springcourse.music.model.impl;

import ua.klunnyi.springcourse.music.model.Music;

/**
 * @author Serhii Klunniy
 */
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Rap song ...";
    }
}
