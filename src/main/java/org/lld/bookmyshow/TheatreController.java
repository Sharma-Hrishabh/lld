package org.lld.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<String, List<Theatre>> theatreMap;

    public TheatreController() {
        theatreMap = new HashMap<>();
    }

    public TheatreController(Map<String, List<Theatre>> theatreMap) {
        this.theatreMap = theatreMap;
    }

    public List<Theatre> getTheatres(String city) {
        return theatreMap.get(city);
    }

    public  void addMovie(String city, Theatre theatre) {
        List<Theatre> theatres = theatreMap.get(city);
        if (theatres == null) {
            theatres = new ArrayList<>();
        }
        theatres.add(theatre);
        theatreMap.put(city, theatres);
    }
}
