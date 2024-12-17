package Q3;

import java.util.Scanner;

public class WeightCalculator {
    private double age;
    private double height;
    private double weight;
    public void input_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        this.age=sc.nextDouble();
        System.out.println("Enter your height:");
        this.height=sc.nextDouble();
    }

    public double recommendWeight(){
        return (height-100+(age/10))*0.9;
    }

    public void display_details(){
        System.out.println("User age:"+this.age);
        System.out.println("User height:"+this.height);
        System.out.printf("Recommend weight: %.2f kg",this.recommendWeight());
    }
}
class Tester{
    public static void main(String[] args) {
        WeightCalculator w1=new WeightCalculator();
        w1.input_details();
        w1.display_details();
    }
}
