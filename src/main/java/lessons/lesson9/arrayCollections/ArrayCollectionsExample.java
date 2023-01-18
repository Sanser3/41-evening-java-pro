package lessons.lesson9.arrayCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayCollectionsExample {

    public static void main(String[] args) {

        List<Book> listOfBook = new ArrayList<>();



        listOfBook.add(new Book(1,"Law"));
        listOfBook.add(new Book(2,"Tax"));
        listOfBook.add(new Book(3,"Civil"));
        System.out.println(listOfBook);

        // listOfBook.clear();

       // System.out.println(listOfBook.size());

        List<Book> listOfBook2 = new LinkedList<>();

        Book newBook4 = new Book(4,"Law2");

        listOfBook2.add(newBook4);
        listOfBook2.add(new Book(5,"Tax3"));
        listOfBook2.add(new Book(6,"Civil3"));



        System.out.println(listOfBook2);


        listOfBook.addAll(listOfBook2);


        System.out.println(listOfBook);

        System.out.println(listOfBook.contains(newBook4));
        listOfBook.remove(newBook4);

        System.out.println(listOfBook);

        Book[] ourBookArray = listOfBook.toArray(new Book[0]);



        System.out.println(listOfBook.size());
       // listOfBook.clear();

        System.out.println(listOfBook.size());
        System.out.println(listOfBook.isEmpty());

        System.out.println(Arrays.toString(ourBookArray));

        System.out.println("----------");

        listOfBook.get(0).bookName = "LawLawLaw";

        System.out.println(listOfBook);
        System.out.println(Arrays.toString(ourBookArray));



    }
}
