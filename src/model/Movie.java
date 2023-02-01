package model;

public class Movie extends Category {


        String name, director;
        int showTime, price;

        Movie(String mainCategory, String genre, String name, String director, int showTime, int price) {
            super(mainCategory, genre);
            this.name = name;
            this.director = director;
            this.showTime = showTime;
            this.price = price;
        }

        @Override
        void GetInfo() {
            super.GetInfo();
            System.out.println("Movie Name: " + name + "Director: " + director + "Show Time: " + showTime + "Price: " + price);
        }

        void getMovies(String showtime) {
            if (showtime.equals(this.showTime)) {
                System.out.println("Movie Name: " + name + "Director: " + director + "Show Time: " + showTime + "Price: " + price);
            }
        }
    }

