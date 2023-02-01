package model;

public class User {
    String name, email;
    int age;

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    void addUserInfo() {
        System.out.println("User Name: " + name + "Age: " + age + "Email: " + email );
    }
}

