package Lab9.Q1;

public class Shape {
    protected String name;
    protected double perimeter;
    protected double area;

    public Shape(String name){
        this.name=name;
    }

    public void setPerimeter(double perimeter){
        this.perimeter=perimeter;
    }

    public void setArea(double area){
        this.area=area;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Perimeter:"+perimeter);
        System.out.printf("Area: %.2f",area);
        System.out.println();
    }


}
class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super("Rectangle");
    }

    public void input(double width,double length){
        this.width=width;
        this.length=length;
    }

    public void computeProperties(){
        setPerimeter((2*length+2*width));
        setArea(length*width);
    }

}

class Circle extends Shape{
    private double diameter;

    public Circle(){
        super("Circle");
    }

    public void input(double diameter){
        this.diameter=diameter;
    }

    public void computeProperties(){
        double radius=diameter/2;
        setPerimeter(Math.PI*2*radius);
        setArea(Math.PI*radius*radius);
    }
}
class Main{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.input(5,3);
        r.computeProperties();
        r.display();
        System.out.println();
        Circle c=new Circle();
        c.input(10);
        c.computeProperties();
        c.display();
        System.out.println();
    }
}