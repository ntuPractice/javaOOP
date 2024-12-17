interface Line{
    public void draw_line();
}

//We can implement multiple interface
public class Rectangle implements polygon,Line{

    @Override
    public void draw_line() {
        System.out.println("Draw a straight line!");
    }

    @Override
    public void getType() {
        System.out.println("Type: Rectangle");
    }

    @Override
    public void getArea(int width, int length) {
        System.out.println("Area of rectangle is "+(width*length));
    }
}

class master{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.draw_line();
        r1.getType();
        r1.getArea(3,5);
    }
}
