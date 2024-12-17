package Q1;

import java.util.Random;

public class Number {
    private int[]array;

    public Number(){
        this(10,100);
    }

    public Number(int size){
        this(size,100);
    }

    public Number(int size,int bound){
        Random rand=new Random();
        array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=rand.nextInt(bound+1);
        }
    }

    public void display_item(){
        System.out.print("Display item:");
        for(int num:array){
            System.out.print(num+" ");
        }
    }

    public void even_num(){
        System.out.println();
        System.out.print("Even number:");
        for(int num:array){
            if(num%2==0){
                System.out.print(num+" ");
            }
        }
    }

    public void prime_num(){
        System.out.println();
        System.out.print("Prime number:");
        for(int num:array){
            if(is_prime(num)){
                System.out.print(num+" ");
            }
        }
    }

    //helper method
    public boolean is_prime(int num){
        if (num<2) {
            return false;
        } else if (num==2) {
            return true;
        }else{
            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    return  false;
                }
            }
            return  true;
        }
    }

    public void max_num(){
        System.out.println();
        int max=array[0];
        for(int num:array){
            if(num>max){
                max=num;
            }
        }
        System.out.println("Maximum number:"+max);
    }

    public void min_num(){
        int min=array[0];
        for(int num:array){
            if(num<min){
                min=num;
            }
        }
        System.out.println("Minimum number:"+min);
    }

    public void average(){
        double sum=0;
        double average=0.0;
        for(int num:array){
            sum+=num;
        }
        average=sum/(array.length);
        System.out.println("Average:"+average);
    }

    public void sqaure_num(){
        //display sqaure of each number
        System.out.print("Sqaure number:");
        for(int num:array){
            System.out.print(num*num+" ");
        }
    }
}

class Tester{
    public static void main(String[] args) {
        Number num1=new Number();
        num1.display_item();
        num1.even_num();
        num1.prime_num();
        num1.max_num();
        num1.min_num();
        num1.average();
        num1.sqaure_num();
        System.out.println();
        System.out.println();

        Number num2=new Number(5);
        num2.display_item();
        num2.even_num();
        num2.prime_num();
        num2.max_num();
        num2.min_num();
        num2.average();
        num2.sqaure_num();
        System.out.println();
        System.out.println();
        Number num3=new Number(4,50);
        num3.display_item();
        num3.even_num();
        num3.prime_num();
        num3.max_num();
        num3.min_num();
        num3.average();
        num3.sqaure_num();
        System.out.println();
        System.out.println();

    }
}
