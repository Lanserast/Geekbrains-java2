package ru.geekbrains;

import java.util.*;

public class Person {
    private  String surname;
 //   private  String phone;
    private  ArrayList<String> phone;
    private  ArrayList<String> email;

    public Person(String surname, String email, String phone) {
        this.surname = surname;

        this.phone = new ArrayList<>();
        this.phone.add(phone);

        this.email = new ArrayList<>();
        this.email.add(email);
    }

    public String getSurname() {
        return surname;
    }

    public List<String> getPhone() {
        return phone;
    }

    public List<String> getEmail() {
        return email;
    }


}