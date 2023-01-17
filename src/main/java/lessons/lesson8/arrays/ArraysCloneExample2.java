package lessons.lesson8.arrays;

import java.util.Arrays;

public class ArraysCloneExample2 {
    public static void main(String[] args) {

        String[][] stringArray = new String[3][3];
        String[][] stringClone = new String[3][3];

        stringArray[0][0] = "0 0";
        stringArray[0][1] = "0 1";
        stringArray[0][2] = "0 2";

        stringArray[1][0] = "1 0";
        stringArray[1][1] = "1 1";
        stringArray[1][2] = "1 2";

        stringArray[2][0] = "2 0";
        stringArray[2][1] = "2 1";
        stringArray[2][2] = "2 2";


        System.out.println(Arrays.deepToString(stringArray));

//        for (int i = 0; i < stringArray.length; i++) {
//            stringClone[i][] = stringArray[i].clone();
//
//        }


        System.out.println("----------");

        System.out.println(Arrays.deepToString(stringArray));
       System.out.println(Arrays.deepToString(stringClone));
        System.out.println("----------");



    }

    public static void clearArray(String[] arrayString){
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i]= "";

        }
    }
}
