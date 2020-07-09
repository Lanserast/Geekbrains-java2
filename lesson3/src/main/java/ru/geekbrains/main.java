package ru.geekbrains;

import java.util.*;

/*1) Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):
Найти список слов, из которых состоит текст (дубликаты не считать);
Посчитать сколько раз встречается каждое слово (использовать HashMap);
2) Написать простой класс PhoneBook(внутри использовать HashMap):
В качестве ключа использовать фамилию
В каждой записи всего два поля: phone, e-mail
Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов), и отдельный метод для поиска e-mail
по фамилии. Следует учесть, что под одной фамилией может быть несколько записей. Итого должно получиться 3 класса Main, PhoneBook, Person. */
public class main {
    public static void main(String[] args) {
        /*Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):*/
        List<String> arrayList = new ArrayList<>();
        arrayList.add("кафе");
        arrayList.add("искра");
        arrayList.add("давление");
        arrayList.add("клык");
        arrayList.add("фото");
        arrayList.add("кафе");
        arrayList.add("искра");
        arrayList.add("давление");
        arrayList.add("клык");
        arrayList.add("фото");
        arrayList.add("кафе");
        arrayList.add("искра");
        arrayList.add("давление");
        arrayList.add("клык");
        arrayList.add("фото");
        arrayList.add("кафе");
        arrayList.add("искра");
        arrayList.add("давление");
        arrayList.add("клык");
        arrayList.add("фото");
        arrayList.add("кафе");
        arrayList.add("искра");
        arrayList.add("давление");
        arrayList.add("клык");
        arrayList.add("фото");
        arrayList.add("кафе");
        arrayList.add("искра");
        arrayList.add("давление");
        arrayList.add("клык");
        arrayList.add("фото");
        /*Посчитать сколько раз встречается каждое слово (использовать HashMap);
        * слово - колличество повторений*/
        Map<String, Integer> HashMap = new HashMap<>();
        for (String str: arrayList) {
            Integer dublicate = HashMap.get(str);
            HashMap.put(str, dublicate == null ? 1 : dublicate + 1);
        }
        System.out.println("Список повторяющихся слов:");
        System.out.println(HashMap);

        System.out.println("-------------------------------");
        PhoneBook phoneBook = new PhoneBook();

        /*Написать простой класс PhoneBook(внутри использовать HashMap): (см класс PhoneBook    )*/
        Person person1 = new Person ("A","AAAAAAAAAAAA.mail.ru", "+77057163877");
        Person person2 = new Person ("A","AA.mail.ru","+77074909644");
        Person person3 = new Person ("B","BBBBBB.mail.ru","+77077799795");
        Person person4 = new Person ("B","BB.mail.ru","+77079517777");
        Person person5 = new Person ("C","CCCCCCCCCCCCCC.mail.ru","+77714927700");
        Person person6 = new Person ("C","CCCCCCCC.mail.ru","+77715740077");
        Person person7 = new Person ("C","CCCCC.mail.ru","+77715797822");
        Person person8 = new Person ("C","CCC.mail.ru","+77770076877");
        Person person9 = new Person ("D","DDDDDD.mail.ru","+77770076977");
        phoneBook.add(person1);
        phoneBook.add(person2);
        phoneBook.add(person3);
        phoneBook.add(person4);
        phoneBook.add(person5);
        phoneBook.add(person6);
        phoneBook.add(person7);
        phoneBook.add(person8);
        phoneBook.add(person9);
     //    phoneBook1.addEmail("A", "AAAAAAAAAAAAAAAAAA.mail.ru");
     //   phoneBook1.addEmail("C", "CCCCCCCCCCCCCC.mail.ru");
        System.out.println("Список номеров людей с фамилией C: " + phoneBook.getPhones("C"));
        System.out.println("Список номеров людей с фамилией A: " + phoneBook.getPhones("A"));
        System.out.println("Список номеров людей с фамилией D: " + phoneBook.getPhones("D"));
        System.out.println("Список номеров людей с фамилией B: " + phoneBook.getPhones("B"));

        System.out.println("Список emal'ов  людей с фамилией A: " + phoneBook.getEmails("A"));
        System.out.println("Список emal'ов  людей с фамилией C: " + phoneBook.getEmails("C"));

        System.out.println("Список emal'ов  людей с фамилией Anon: " + phoneBook.getPhones("Anon"));
    }

}
