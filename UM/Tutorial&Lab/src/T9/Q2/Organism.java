package T9.Q2;

public class Organism {
    private final double initial_Size;
    private final double growth_rate;

    public Organism(double initial_Size,double growth_rate){
        this.initial_Size=initial_Size;
        this.growth_rate=growth_rate;
    }

    public double getSize(){
        return this.initial_Size;
    }

    public double getGrowthRate(){
        return this.growth_rate;
    }
}
class Animal extends Organism{
    private double amount_eat;
    public Animal(double initial_Size,double growth_rate,double amount_eat){
        super(initial_Size,growth_rate);
        this.amount_eat=amount_eat;
    }

    public void display_details(){
        System.out.println("Size:"+getSize());
        System.out.println("Growth rate:"+getGrowthRate());
        System.out.println("Amount Eat:"+this.amount_eat);
    }
}

class Main{
    public static void main(String[] args) {
        Animal dog=new Animal(10.5,2.3,5.0);
        dog.display_details();
    }
}
