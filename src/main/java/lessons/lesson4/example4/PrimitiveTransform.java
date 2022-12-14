package lessons.lesson4.example4;

import java.sql.SQLOutput;

public class PrimitiveTransform {
    public static void main(String[] args) {

        int x =10;
        double y = 12.5;

        Integer xRef = x;
        Double yRef = y;

        System.out.println(xRef);
        System.out.println(yRef);


        int resUnpack = xRef.intValue();



    }
}
