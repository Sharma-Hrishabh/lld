package org.lld.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    int id;
    String name;
    List<Screen> screens;
    List<Show> shows;
    public Theatre(int id, String name) {
        this.id = id;
        this.name = name;
        screens = new ArrayList<>();
        shows = new ArrayList<>();
    }

    public void addScreen(Screen screen) {
        screens.add(screen);
    }

    public void addShow(Show show) {
        shows.add(show);
    }
}
