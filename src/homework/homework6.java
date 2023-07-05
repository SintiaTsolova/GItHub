package homework;

abstract class Shape{
    public abstract double getArea();
    public abstract double getPerimeter();

}
class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return 2 * Math.PI * radius;
    }

    public double getPerimeter(){
        return Math.PI * radius * radius;
    }
}

class Square extends Shape{

    private double length;
    private double width;

    public Square(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2 * (length + width);
    }
}

public class homework6 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The perimeter of the circle is: " + circle.getPerimeter());

        Shape square = new Square(4.0, 6.0);
        System.out.println("The area of the square is: " + square.getArea());
        System.out.println("The perimeter of the square is: " + square.getPerimeter());
    }
}