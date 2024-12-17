package T9.Q4;

public class PurchaseSystem {
    protected String product_code;
    protected double unit_price;
    protected int quantity;
    protected double totalPrice;

    public PurchaseSystem(String product_code,double unit_price,int quantity){
        this.product_code=product_code;
        this.unit_price=unit_price;
        this.quantity=quantity;
        this.totalPrice=0.0;
    }

    public double total_price(){
        totalPrice=unit_price*quantity;
        return totalPrice;
    }

    public void display(){
        System.out.println("Product code:"+product_code);
        System.out.println("Unit price:"+unit_price);
        System.out.println("Quantity:"+quantity);
        System.out.println("Total price:"+total_price());
    }



}
class SugarPurchase extends PurchaseSystem{
    private final double sugarWeight;

    public SugarPurchase(String code,double unit_price,int quantity,double sugarWeight){
        super(code,unit_price,quantity);
        this.sugarWeight=sugarWeight;
    }

    @Override
    public double total_price() {
        totalPrice=unit_price*quantity*sugarWeight;
        return totalPrice;
    }

    public void display(){
        super.display();
        System.out.println("Sugar weight:"+this.sugarWeight);
    }
}
class Tester{
    public static void main(String[] args) {
        PurchaseSystem purchase=new PurchaseSystem("P0001",10.0,5);
        purchase.display();
        System.out.println();
        SugarPurchase purchase1=new SugarPurchase("S0001",15.0,3,2.5);
        purchase1.display();
    }
}
