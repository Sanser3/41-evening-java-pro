package lessons.lesson5.lessoncode;

/*
        * Напишите программу, в которой:
        *  - создайте массив целых чисел длиной 3,
        *  - заполните каждую ячейку массива любым целым числом,
        *  - выведите значение каждой ячейки на консоль.
        */

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.util.Random;

public class Lesson5 {
    public static void main(String[] args) {

        Lesson5 lesson5Code = new Lesson5();

        Random random = new Random();

        int arraySize = random.nextInt(50);

        int [] workingArray = lesson5Code.establishing(arraySize);

        lesson5Code.fillIn(workingArray);

        lesson5Code.output(workingArray);

        System.out.println("Increase each element :");

        int [] arrayAfterIncrease = lesson5Code.increaseByTwo(workingArray);

        lesson5Code.output(arrayAfterIncrease);

        System.out.println("Original array");
        lesson5Code.output(workingArray);

    }

    public int[] establishing(int arraySize){
        return new int[arraySize];
    }
    public void fillIn(int [] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
           // arr[i] = (int) (Math.random() * 10);
            arr[i] = random.nextInt(100);
        }
    }

    public int [] increaseByTwo (int [] arr) {
        int [] arrayAfterIncrease = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrayAfterIncrease[i] = arr[i]+2;
        }
        return arrayAfterIncrease;
    }
    public void output(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+ " array element -  "+arr[i]);
        }
    }
}
