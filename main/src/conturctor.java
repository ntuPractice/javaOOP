public class conturctor {
    //3 type of constructor
    /* i) Constructor with no parameter [No argument constructor]
     * ii) Parameterized constructor [Constructor with parameter]
     * iii) Default constructor
     */
    @SuppressWarnings("FieldMayBeFinal")
    private int i;
    public conturctor(){
        i=5;
        System.out.println("Public constructor is called");
    }
    //if set the consturctor as private creating object outside the class is prohibited
  
    public void getI(){
        System.out.println("I value:"+i);
    }
    
}

class Mendos{
    public static void main(String[] args) {
        conturctor c=new conturctor();
        c.getI();
    }
}