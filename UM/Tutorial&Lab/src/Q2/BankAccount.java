package Q2;

public class BankAccount {
    private String name;
    private String IC;
    private double balance;

    public BankAccount(String name,String IC,double initialDeposit){
        this.name=name;
        this.IC=IC;
        if(initialDeposit>=0){
            balance+=initialDeposit;
        }else{
            this.balance=0;
        }
    }

    public void deposit(double amount,String name){
        if(amount>=0){
            this.balance+=amount;
            System.out.println(name+" sucessfully deposited: "+amount);
        }else{
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount,String name){
        if(amount>=0 && amount<=balance){
            balance-=amount;
            System.out.println(name+" sucessfully withdraw "+amount+" dollar.");
        }else if(amount>balance){
            System.out.println("Insufficient amount to withdraw!");
        }else{
            System.out.println("Amount must be postive value!");
        }
    }

    public double display_Balance(){
       return this.balance;
    }

    public String getName(){
        return this.name;
    }

    public String getIC(){
        return this.IC;
    }
}

class Tester{
    public static void main(String[] args) {
        BankAccount account=new BankAccount("John","A12345566",500.0);
        BankAccount account1=new BankAccount("Ben","A12311349",200.0);

        System.out.println("Account Name:"+account.getName()+"\n"+
                            "Account IC:"+account.getIC()+"\n"+
                            "Initial deposit:"+account.display_Balance());

        System.out.println();

        System.out.println("Account Name:"+account1.getName()+"\n"+
                "Account IC:"+account1.getIC()+"\n"+
                "Initial deposit:"+account1.display_Balance());
        System.out.println();
        account.deposit(200.0,account.getName());
        account1.deposit(900.0, account1.getName());
        System.out.println();
        System.out.println("Display balance of account "+account.display_Balance());
        System.out.println("Display balance of account "+account1.display_Balance());
        System.out.println();
        account.withdraw(300.0, account.getName());
        account1.withdraw(500.0, account1.getName());
        System.out.println();
        System.out.println("Display balance of account "+account.getName()+" "+account.display_Balance());
        System.out.println("Display balance of account "+account1.getName()+" "+account1.display_Balance());
    }
}
