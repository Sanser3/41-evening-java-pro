package lessons.lesson8.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
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

        System.out.println(cats.toString());

        //cats.remove(begemot);

        for (Cat cat: cats){
//            if (cat.name.equals("Begemot")){
//                cats.remove(cat);
//            }
 //           cats.add(new Cat("Burbon"));
       }



        System.out.println(cats.toString());

        //-----------------------------------------

        Iterator<Cat> catIterator = cats.iterator();
        catIterator.next();

        while ((catIterator.hasNext())){
            System.out.println(catIterator.next());
        }


        Iterator<Cat> catIterator2 = cats.iterator();

        while ((catIterator2.hasNext())){
            Cat tempCat = catIterator2.next();

            if (tempCat.name.equals("Begemot")){
                System.out.println("equal");
                catIterator2.remove();
            }
        }


        System.out.println(cats);

    }
}
