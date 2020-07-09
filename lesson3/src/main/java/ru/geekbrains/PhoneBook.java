package ru.geekbrains;
import java.util.*;
public class PhoneBook {
  //  private Person person;
   // private HashMap<Person, ArrayList<String>> phoneBook = new HashMap<>();
  private HashMap<String, HashSet<Person>> PhoneBookMap = new HashMap<>();

    public void add(Person person) {
        String surname = person.getSurname();
        HashSet<Person> persons = PhoneBookMap.get(surname);
        if (persons == null) {
            persons = new HashSet<>();
            PhoneBookMap.put(surname, persons);
        }
        persons.add(person);
    }

    public ArrayList<String> getPhones(String surname) {
        HashSet<Person> persons = PhoneBookMap.get(surname);
        ArrayList<String> phones = new ArrayList<>();
        try {
            for (Person person : persons) {
                phones.addAll(person.getPhone());
            }
        }
        catch (NullPointerException e){
            System.out.println();
            phones.add("Телефонный номер данного пользователя " +surname+" отсутсвует в справочнике");
        }
        return phones;
    }

    public ArrayList<String> getEmails(String surname) {
        HashSet<Person> persons = PhoneBookMap.get(surname);
        ArrayList<String> emails = new ArrayList<>();
        for (Person person : persons) {
            emails.addAll(person.getEmail());
        }
        return emails;
    }

}
