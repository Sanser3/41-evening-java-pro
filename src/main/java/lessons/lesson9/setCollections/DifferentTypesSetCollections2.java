package lessons.lesson9.setCollections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class DifferentTypesSetCollections2 {
    public static void main(String[] args) {

        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

        set.add("Apple");
        set.add("Lemon");
        set.add("Banana");
        set.add("Apple");

        Iterator<String> itr = set.iterator();

        System.out.println("Fruits set:");
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
    }

}
