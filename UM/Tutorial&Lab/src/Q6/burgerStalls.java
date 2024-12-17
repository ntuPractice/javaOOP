package Q6;

public class burgerStalls {
    private String ID;
    private int burger_sold;
    static int total_burger_sold;

    public burgerStalls(String id){
        this.ID=id;
        this.burger_sold=0;
    }

    public void sell_burger(int num){
        this.burger_sold+=num;
        total_burger_sold+=num;
        System.out.println(this.ID+" sell "+num+" burgers.");
    }

    public int getBurger_sold(){
        return this.burger_sold;
    }

    public String get_ID(){
        return this.ID;
    }

    public void display_burger_sold(){
        System.out.println(this.ID+" sold "+this.burger_sold+" burger.");
    }

    public static void display_total_burger_sold(){
        System.out.println("Total number sold in all stalls "+total_burger_sold);
    }
}

class Tester{
    public static void main(String[] args) {
        burgerStalls stalls1=new burgerStalls("1234");
        burgerStalls stalls2=new burgerStalls("1235");
        burgerStalls stalls3=new burgerStalls("1236");
        stalls1.sell_burger(34);
        stalls2.sell_burger(42);
        stalls3.sell_burger(21);
        stalls2.sell_burger(31);
        System.out.println();
        stalls1.display_burger_sold();
        stalls2.display_burger_sold();
        stalls3.display_burger_sold();
        System.out.println();
        burgerStalls.display_total_burger_sold();
    }
}
