package lessons.lesson5.lessoncode;

import java.util.Arrays;
import java.util.Random;

public class SearchInArray {

    public static void main(String[] args) {
        Random random = new Random();

        SearchInArray searchInArray = new SearchInArray();


        int [] workingArray = searchInArray.createArray();


        System.out.println(Arrays.toString(workingArray));


        int [] sortedArray= searchInArray.sortedArray(workingArray);


        System.out.println(Arrays.toString(sortedArray));

        int elementForSearch = random.nextInt(2000);

        System.out.println("Elemnet for search - " + elementForSearch);

        System.out.println("Index in Array - " +searchInArray.searchIndex(sortedArray,elementForSearch));



    }

    public int [] createArray(){

      //   int [] workingArray = {6,3,9,15,74,234,76,15,27,1,345};

        Random random = new Random();

        int sizeArray = 2000;//random.nextInt(20);

        int [] workingArray = new int[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            workingArray[i] = random.nextInt(2000);
        }

        return workingArray;
    }
    public int [] sortedArray(int [] workingArray){

        int [] sortedArray= new int[workingArray.length];

        System.arraycopy(workingArray,0,sortedArray,0, workingArray.length);
        Arrays.sort(sortedArray);


        return sortedArray;
    }
    public  int searchIndex (int [] arrayForSearch, int elementForSearch){
        int index=-1;

        for (int i = 0; i < arrayForSearch.length; i++) {
            if (elementForSearch== arrayForSearch[i]){
                index=i;
                break;
            }

        }

        return index;
    }

}
