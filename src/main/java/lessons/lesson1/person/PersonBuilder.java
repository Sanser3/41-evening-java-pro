package lessons.lesson1.person;

public class PersonBuilder {

    public static void main(String[] args) {

        Person newPerson = new Person("Petya", 25, 75);

        Person newPerson2 = new Person("Vasya", 35);

        newPerson.say("My name is Petya");

        newPerson2.say("Hello, Petya!");




    }
}