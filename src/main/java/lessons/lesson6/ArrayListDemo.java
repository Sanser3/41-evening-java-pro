package lessons.lesson6;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList <String>  stringArrayList = new ArrayList<>();

        System.out.println(stringArrayList.size());

        stringArrayList.add("A");

        System.out.println(stringArrayList.size());

        String firstElement = stringArrayList.get(0);
        System.out.println(firstElement);

        addData(stringArrayList);

        System.out.println(stringArrayList);

        stringArrayList.trimToSize();

        for (String string:stringArrayList) {
            System.out.println(string);
        }

        Collections.sort(stringArrayList);

        System.out.println(stringArrayList);


    }

    public static void addData (List<String> workingCollection){
        workingCollection.add("B");
        workingCollection.add("Bg");
        workingCollection.add("Ba");
        workingCollection.add("Bk");
        workingCollection.add("C");
        workingCollection.add("C");
        workingCollection.add("C");
        workingCollection.add("C");
        workingCollection.add("D");
        workingCollection.add("D");
        workingCollection.add("D");
        workingCollection.add("D");
        workingCollection.add("E");
        workingCollection.add("E");
        workingCollection.add("E");
        workingCollection.add("E");
        workingCollection.add("B");
        workingCollection.add("F");
        workingCollection.add("F");
        workingCollection.add("F");
        workingCollection.add("G");
        workingCollection.add("H");


    }
}
