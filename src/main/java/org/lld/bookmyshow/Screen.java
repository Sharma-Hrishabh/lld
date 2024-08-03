package org.lld.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    int id;
    List<Seat> seats;

    public Screen(int id){
        this.id = id;
        seats = new ArrayList<>();
    }
}
