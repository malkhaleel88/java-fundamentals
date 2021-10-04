package inheritance;

import java.util.HashMap;
import java.util.LinkedList;

public class Theater {

    private String name;
    private LinkedList<String> moviesName = new LinkedList<>();

    private HashMap<Review, String> theaterReviews = new HashMap<>();

    public Theater(String name) {
        this.name = name;
    }

    public HashMap<Review, String> getTheaterReviews() {
        return theaterReviews;
    }

    public void addMovie(String movie){
        this.moviesName.add(movie);
    }


    public void removeMovie(String movie){
        this.moviesName.remove(movie);
    }

    public void addTheaterReview(Review review, String movie){
        if(!getTheaterReviews().containsValue(movie)){
            getTheaterReviews().put(review,movie);
        }else {
            System.out.println("YOU ALREADY RATED THIS MOVIE");
        }

    }


    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", moviesName=" + moviesName +
                '}';
    }

}
