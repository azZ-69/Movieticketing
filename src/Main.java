import model.Movie;
import model.Seat;
import model.User;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        Movie m1 = new Movie(1, 5, "Action", "Jack Wilson", 10, 500);
        moviesList.add(m1);
        Movie m2 = new Movie(4,8, "Drama", "Chris Smith", 1, 680);
        moviesList.add(m2);


        ArrayList<User> users = new ArrayList<User>();
        User u1 = new User("Slou", "ccjol@gmail.com",20);
        users.add(u1);
        User u2 = new User("Axix", "asddw@gmail.com", 18);
        users.add(u2);

        ArrayList<Seat> seats = new ArrayList<>();
        Seat s1 = new Seat(4);
        seats.add(s1);
        Seat s2 = new Seat(8);
        seats.add(s2);


    }
}
