package lessons.lesson5.lessoncode;

import java.util.Arrays;

public class SearchArrayTest {
    public static void main(String[] args) {
        SearchInArray searchInArray = new SearchInArray();
        SearchArrayTest searchArrayTest = new SearchArrayTest();

        int [] workingArray = {6,3,9,15,74,234,76,15,27,1,345};

        int [] expectedSortResult = {1,3,6,9,15,15,27,74,76,234,345};

        int elementForSearch = 15;

        int expectedIndex = 4;

        int [] testSortResult = searchInArray.sortedArray(workingArray);

        if (searchArrayTest.isSortedCorrect(testSortResult,expectedSortResult)) {
            System.out.println("Test sorted array - correct!");
        } else {
            System.out.println("Test sorted array - not correct!");
            System.out.println("Expected " + Arrays.toString(expectedSortResult));
            System.out.println("But test result " + Arrays.toString(testSortResult));
        }


        int testIndexResult = searchInArray.searchIndex(testSortResult,elementForSearch);

        if (testIndexResult==expectedIndex) {
            System.out.println("Test index search - correct!");
        } else {
            System.out.println("Test index search  - not correct!");
            System.out.println("Expected " + expectedIndex);
            System.out.println("But test result " + testIndexResult);
        }


    }

    public boolean isSortedCorrect(int [] testArray, int [] expectedArray){
        boolean isTestCoorrect = true;

        if (testArray.length!=expectedArray.length){
            isTestCoorrect = false;
            return isTestCoorrect;
        }


        for (int i = 0; i < testArray.length; i++) {

            if (testArray[i] == expectedArray[i]){
                isTestCoorrect=isTestCoorrect&&true;
            } else {
                isTestCoorrect=isTestCoorrect&&false;
            }
        }

        return isTestCoorrect;
    }
}
