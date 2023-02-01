package model;

public class Category extends MainCategory{
    String genre;

    Category(String MainCategory, String genre) {
        super(MainCategory);
        this.genre = genre;
    }

    @Override
    void GetInfo() {
        super.GetInfo();
        System.out.println("Genre: " + genre);
    }
}

