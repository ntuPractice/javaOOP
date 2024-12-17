package T9.Q3;

public class PaySystem {
    private double payrate;
    private double hours;


    public PaySystem(double payrate,double hours){
        this.payrate=payrate;
        this.hours=hours;
    }

    public double getPayrate(){
        return this.payrate;
    }

    public double getHours() {
        return hours;
    }

    public double totalPay(){
        return payrate*hours;
    }

    public void totalPayment() {
        System.out.println("Total payment:" + totalPay());
    }
}

class RegularPay extends PaySystem{

    public RegularPay(double payrate,double hours){
        super(payrate,hours);
    }
}

class SpecialPay extends PaySystem{
    public SpecialPay(double payrate,double hours){
        super(payrate, hours);
    }

    @Override
    public double totalPay() {
        double base_pay=super.totalPay();
        double commision=0.3*base_pay;
        return base_pay+commision;
    }
}

class Main{
    public static void main(String[] args) {
        PaySystem p1=new RegularPay(20.0,40);
        System.out.println("Regular pay:");
        p1.totalPayment();

        PaySystem p2=new SpecialPay(20.0,40);
        System.out.println("Special pay:");
        p2.totalPayment();

    }
}