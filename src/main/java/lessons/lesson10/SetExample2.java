package lessons.lesson10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        Set<String> days = new HashSet<>();


        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Monday");


        Iterator itr = days.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
