package lessons.lesson9.setCollections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetCollectionExample {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();

        stringHashSet.add("January");
        stringHashSet.add("February");
        stringHashSet.add("March");
        stringHashSet.add("April");
        stringHashSet.add("May");
        stringHashSet.add("June");
        stringHashSet.add("January");

        System.out.println(stringHashSet);


        HashSet<ArrayList> ourSetExample = new HashSet<>();

        ArrayList<Integer> intArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList =new ArrayList<>();
        ArrayList<Student> stusentsArrayList =new ArrayList<>();


        intArrayList.add(1);
        intArrayList.add(2);
        intArrayList.add(3);
        intArrayList.add(4);
        intArrayList.add(5);


        stringArrayList.add("January");
        stringArrayList.add("February");
        stringArrayList.add("March");
        stringArrayList.add("April");
        stringArrayList.add("May");
        stringArrayList.add("June");

        stusentsArrayList.add(new Student(1, "Petr"));
        stusentsArrayList.add(new Student(2,"Viktor"));

        ourSetExample.add(intArrayList);
        ourSetExample.add(stringArrayList);
        ourSetExample.add(stusentsArrayList);

        System.out.println(ourSetExample.size());

        System.out.println(ourSetExample);
    }

}
