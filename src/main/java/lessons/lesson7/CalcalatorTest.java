package lessons.lesson7;

public class CalcalatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int parametr1 = 5;
        int parametr2 = 10;

        int expectedResult = 25;

        int realResult = calculator.sum(parametr1,parametr2);

        if (expectedResult==realResult){
            System.out.println("Test pased OK!");
        } else {
            System.out.println("Test passed FAIL!");
            System.out.println( "Expected result - " + expectedResult+
                    " but real result is - " + realResult);
        }


    }
}
