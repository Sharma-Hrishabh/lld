package org.lld.bookmyshow;

import java.util.List;

public class BookMyShow {

    MovieController movieController;
    TheatreController theatreController;

    public BookMyShow() {}

    public void initialize(){
        Movie movie1 = new Movie(1,"Deadpool");
        Movie movie2 = new Movie(2,"F1");


        movieController = new MovieController();
        movieController.addMovie("blr",movie1);
        movieController.addMovie("blr",movie2);
        movieController.addMovie("hyd",movie1);

        Theatre theatre1 = new Theatre(1,"IMAX");
        Theatre theatre2 = new Theatre(2,"PVR");
        Theatre theatre3 = new Theatre(3,"Prasad");

        theatreController = new TheatreController();
        theatreController.addMovie("blr",theatre1);
        theatreController.addMovie("blr",theatre2);
        theatreController.addMovie("hyd",theatre3);

        Screen screen1 = new Screen(1);
        Screen screen2 = new Screen(2);
        theatre1.addScreen(screen1);
        theatre1.addScreen(screen2);

        Screen screen3 = new Screen(3);
        theatre2.addScreen(screen3);

        Screen screen4 = new Screen(4);
        theatre3.addScreen(screen4);

        Show show1 = new Show(1,movie1,screen1,12);
        Show show2 = new Show(2,movie1,screen1,5);
        Show show3 = new Show(3,movie2,screen3,12);
        Show show4 = new Show(4,movie2,screen4,5);

        theatre1.addShow(show1);
        theatre1.addShow(show2);
        theatre2.addShow(show3);
        theatre3.addShow(show4);

    }

    public List<Movie> getAllMovieListByLocation(String city){
        return this.movieController.getMovies(city);
    }

    public List<Theatre> getAllTheatreListByLocation(String city){
        return this.theatreController.getTheatres(city);
    }

    public void bookMovie(Movie movie){

    }


}
