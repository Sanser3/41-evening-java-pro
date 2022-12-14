package lessons.lesson2.shape;

class ShapeUtils {

    public double sumAreas(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];

            sum = shape.calculateArea() + sum;
            shape.fire();
        }
        return sum;
    }
}
