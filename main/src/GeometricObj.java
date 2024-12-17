
package main.src;
import java.util.Date;

public class GeometricObj {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObj(){
        dateCreated=new java.util.Date();
    }
    public GeometricObj(String color,boolean filled){
        super();
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled=filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "Color:"+getColor()+"\n Filled:"+isFilled()+"\n Date created:"+getDateCreated();
    }
}

class Circle extends GeometricObj{
    private double radius;

    public Circle(){
    }
    public Circle(double radius){
        this(radius,"white",true);
    }

    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public double getDiameter(){
        return 2*radius;
    }

    public void printCircle(){
        System.out.println("The circle is created on " + getDateCreated() + " and the radius is " + radius);
    }
}
class TestGeometricObj{
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red", true);
        System.out.println("Circle Details:");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Filled: " + circle.isFilled());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Diameter: " + circle.getDiameter());
        circle.printCircle();
    }
}