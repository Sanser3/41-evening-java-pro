package lessons.lesson6;

import java.util.Arrays;

public class PersonDatabaseArrayDemo {

    public static void main(String[] args) {
        // int [] intArray = new int[10];
        Person[] personArray = new Person[5];

        personArray = getPersonArray(personArray);

        introduce(personArray);

        checkClone(personArray);

        Person testPerson = personArray[0];

        testPerson.setName("HERO!");

        System.out.println(Arrays.toString(personArray));

    }

    private static void checkClone(Person[] personArray) {
        if( personArray[0].equals(personArray[1])){
           System.out.println("Clone");
       } else {
           System.out.println("Different");
       }
    }

    private static void introduce(Person[] personArray) {
        for (int i = 0; i < personArray.length; i++) {
               if (personArray[i]!=null) {
                   System.out.println(personArray[i]);
                   personArray[i].say();}
        }
    }

    private static Person[] getPersonArray(Person[] personArray) {
        personArray = getPeople(personArray, "Ruslan", 29, 123321999);
        personArray = getPeople(personArray, "Ruslan", 29, 123321999);
        personArray = getPeople(personArray, "Viktor", 35, 1525476999);
        personArray = getPeople(personArray, "Vladislav", 26, 835833465);
        personArray = getPeople(personArray, "Alex", 30, 321999);
        personArray = getPeople(personArray, "John", 33, 833465);
        return personArray;
    }

    private static Person[] getPeople(Person[] personArray, String name, int age, int personalCode) {
        if (personArray[personArray.length - 1] == null) {
            addToDatabase(personArray, new Person(name, age, personalCode));
        } else {
            personArray = increaseDatabase(personArray);

            addToDatabase(personArray,new Person(name, age, personalCode));
        }
        return personArray;
    }

    public static Person[] increaseDatabase(Person[] oldArray) {
        Person[] newPersonArray = new Person[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newPersonArray[i] = oldArray[i];
        }
        return newPersonArray;
    }

    public static void addToDatabase(Person[] personArray, Person newPerson) {

        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i] == null) {
                personArray[i] = newPerson;
                return;
            }
        }

    }


}
