package lessons.lesson9.setCollections;

import java.util.SortedSet;
import java.util.TreeSet;

public class DifferentTypesSetCollections {
    public static void main(String[] args) {

        SortedSet<String> sortedSet =new TreeSet<>();

        sortedSet.add("A");
        sortedSet.add("B");
        sortedSet.add("C");
        sortedSet.add("D");
        sortedSet.add("E");
        sortedSet.add("F");
        sortedSet.add("G");
        sortedSet.add("H");
        sortedSet.add("I");
        sortedSet.add("J");
        sortedSet.add("K");
        sortedSet.add("L");
        sortedSet.add("M");
        sortedSet.add("N");
        sortedSet.add("O");



        sortedSet.add("A");



        String checkContains="D";

        System.out.println("Contains " + checkContains + " " + sortedSet.contains(checkContains));

        System.out.println("First Value " + sortedSet.first());

        System.out.println("Last Value " + sortedSet.last());


        sortedSet.remove("D");

        System.out.println("After removing element " + sortedSet);


        for (String value: sortedSet) {
            System.out.print((value + ", "));
        }

    }
}
