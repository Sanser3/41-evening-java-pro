package lesson1.phone2;

public class PhoneDemo {

    public static void main(String[] args) {

        Phone iphone = new Phone("Iphone 13", "black");

        MyPhone myPersonalPhone = new MyPhone(123456789, iphone);

        MyPhone herPersonalPhone = new MyPhone(55566778, iphone);


        System.out.println( myPersonalPhone);
        System.out.println(herPersonalPhone);

        iphone.setColor("grey");

       System.out.println( myPersonalPhone);
        System.out.println(herPersonalPhone);



        myPersonalPhone.changePhoneColor("white");

        System.out.println(  myPersonalPhone);
        System.out.println( herPersonalPhone);



    }
}
