package lessons.lesson10.hashCodeExample;

import java.util.HashMap;
import java.util.Map;

class ChangeKeyValueMapExample {


    public static void main(String[] args) {
        Map<Person, Dog> personDogMap = new HashMap<>();
        personDogMap.put(new Person("Petya"), new Dog("Tuzik"));
//        Dog dog = personDogMap.get(new Person("Petya"));
//        System.out.println(dog);

        Person person = new Person("Vasya");
        System.out.println("Vasya hash = " + person.hashCode());
        personDogMap.put(person, new Dog("Bobik"));

        System.out.println(personDogMap);

        person.setName("Ruslan");
        System.out.println("Ruslan (1) hash = " + person.hashCode());

        System.out.println(personDogMap);
        Dog secondDog = personDogMap.get(person);

        Person ruslan = new Person("Ruslan");
        System.out.println("Ruslan (2) hash = " + ruslan.hashCode());
        Dog thirdDog = personDogMap.get(ruslan);
        Person vasya = new Person("Vasya");
        System.out.println("Vasya (2) hash = " + vasya.hashCode());
        Dog fourthDog = personDogMap.get(vasya);

        System.out.println(personDogMap);


        personDogMap.put(ruslan, new Dog("Sharik"));

        System.out.println(secondDog);
        System.out.println(thirdDog);
        System.out.println(fourthDog);

        System.out.println(personDogMap);

        personDogMap.entrySet()
                .stream()
                .forEach(entry -> {
                    System.out.println("Key: " + entry.getKey());
                    System.out.println("Value: " + entry.getValue());
                    System.out.println("Key hash: " + entry.hashCode());
                });
    }
}
