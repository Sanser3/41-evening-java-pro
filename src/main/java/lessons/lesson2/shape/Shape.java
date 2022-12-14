package lessons.lesson2.shape;

abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
    public void fire(){
        System.out.println("Fire");
    }
}
