package lessons.lesson8.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList <Cat> cats = new ArrayList<>();

        Cat murzik = new Cat("Murzik");
        Cat barsik = new Cat("Barsik");
        Cat begemot = new Cat("Begemot");
        Cat lastochka = new Cat("Lastochka");
        Cat pushok = new Cat("Pushok");

        cats.add(murzik);
        cats.add(barsik);
        cats.add(begemot);
        cats.add(lastochka);
        cats.add(pushok);


        //-----------------------------------------

        ListIterator<Cat> catIterator = cats.listIterator();


        while ((catIterator.hasNext())){

            Cat tempCat = catIterator.next();
            if (tempCat.name.equals("Begemot")){

                catIterator.remove();
                catIterator.add(new Cat("Burbon"));

            }
        }

        System.out.println(cats);

        while ((catIterator.hasPrevious())){
            System.out.println(catIterator.previous());
        }

        System.out.println(cats);
    }
}
