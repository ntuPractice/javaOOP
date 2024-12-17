package Q4;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public void input(int numerator,int denominator){
        setNumerator(numerator);
        setDenominator(denominator);
    }
    //setter[mutator]
    public void setNumerator(int num){
        this.numerator=num;
    }

    public void setDenominator(int num){
        if(num==0){
            throw new IllegalArgumentException("Denominator cannot be zero!");
        }
        this.denominator=num;
    }

    //getter[accessor]
    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }
    public void display_fraction(){
        int divisor=gcd(denominator,numerator);
        numerator=numerator/divisor;
        denominator=denominator/divisor;
        System.out.println("Fraction in lowest terms:"+numerator+"/"+denominator);
    }

    private int gcd(int a,int b){
        if(b==0){
            return Math.abs(a);
        }
        return gcd(b,a%b);

    }

}

class Tester{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator:");
        int numerator=sc.nextInt();
        System.out.println("Enter denominator:");
        int denominator=sc.nextInt();
        Fraction fraction=new Fraction();
        fraction.input(numerator,denominator);
        System.out.println("Numerator:"+fraction.getNumerator());
        System.out.println("Denominator:"+fraction.getDenominator());
        fraction.display_fraction();
    }
}
