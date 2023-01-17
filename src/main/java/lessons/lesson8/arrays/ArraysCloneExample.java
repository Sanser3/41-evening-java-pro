package lessons.lesson8.arrays;

import java.util.Arrays;

public class ArraysCloneExample {
    public static void main(String[] args) {

        String[] stringArray = new String[5];

        stringArray[0] = "1";
        stringArray[1] = "2";
        stringArray[2] = "3";
        stringArray[3] = "4";
        stringArray[4] = "5";

        System.out.println(Arrays.toString(stringArray));

        String[] stringArrayDublicate = stringArray.clone();

        stringArrayDublicate[3] = "12";

        System.out.println("----------");

        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(stringArrayDublicate));
        System.out.println("----------");

        Dog[] ourKannel =  new Dog[5];

        System.out.println(ourKannel);

        ourKannel[0] = new Dog("Tuzik");
        ourKannel[1] = new Dog("Bobik");
        ourKannel[2] = ourKannel[1];
        ourKannel[4] = new Dog("Arlekin");

        System.out.println(Arrays.toString(ourKannel));

        System.out.println("----------");

        System.out.println(Arrays.toString(stringArray));

        clearArray(stringArrayDublicate);

        System.out.println(Arrays.toString(stringArrayDublicate));

        System.out.println(Arrays.toString(stringArray));

        System.out.println("----------");

    }

    public static void clearArray(String[] arrayString){
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i]= "";

        }
    }
}
