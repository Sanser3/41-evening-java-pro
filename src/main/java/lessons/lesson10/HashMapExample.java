package lessons.lesson10;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<Person,Dog> personDogMap = new HashMap<>();

        Person ruslan = new Person("Ruslan",30);
        Person vasya = new Person("Vasya",30);

        Dog sharik = new Dog("Sharik");

        System.out.println(ruslan.equals(vasya));


        personDogMap.put(new Person("Ruslan",30),  new Dog("Bobik1"));
        personDogMap.put(new Person("Ruslan",30),  new Dog("Bobik2"));
        personDogMap.put(new Person("Ruslan",31),  new Dog("Bobik3"));
        personDogMap.put(new Person("Ruslan",32), new Dog("Bobik7"));
        personDogMap.put(new Person("Ruslan",33), new Dog("Bobik4"));

        System.out.println(personDogMap);



        String string1 = "Java";
        String string2 = "Java";
        String string3 = new String("Java");

        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string3));





    }
}
