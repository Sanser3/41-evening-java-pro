package lessons.lesson1.phone;

public class PhoneDemo {

    public static void main(String[] args) {

        Phone iphone = new Phone("Iphone 13", "black");

        MyPhone myPersonalPhone = new MyPhone(123456789, iphone);


        System.out.println( myPersonalPhone);

        iphone.setColor("grey");

        System.out.println( myPersonalPhone);

        myPersonalPhone.changePhoneColor("white");

        System.out.println( myPersonalPhone);









    }
}
