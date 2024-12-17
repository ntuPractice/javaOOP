package T8;

public class Digit {
    private int number;

    public Digit(int number){
        this.number=number;
    }

    public int DigitMultiplication(){
        if(this.number==0){
            return 0;
        }else{
         int multiplication=1;
         int temp=this.number;
         while (temp!=0){
             multiplication=multiplication*(temp%10);
             temp=temp/10;
         }
         return multiplication;
        }
    }

    public void displayDigitMultiplication(){
        System.out.println("Digit multiplication of the "+this.number+" is "+DigitMultiplication());
    }
}

class Tester{
    public static void main(String[] args) {
        int number=1234;
        Digit digit=new Digit(number);
        digit.displayDigitMultiplication();
    }
}
