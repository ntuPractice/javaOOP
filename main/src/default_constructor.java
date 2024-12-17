public class default_constructor {
    //if we do not create any constructor,Java compiler will create it automatically
    // float a;
    // boolean b;
    // double c;
    // public static void main(String[] args) {
    //     default_constructor d=new default_constructor();
    //     System.out.println("Default value of float:"+d.a);
    //     System.out.println("Default value of boolean:"+d.b);
    //     System.out.println("Default value of double:"+d.c);
    
    // }

    //constructor overloading
    String name;
    default_constructor(){
        this.name="Java";
    }

    default_constructor(String name){
        this.name=name;
    }

    public void getName(){
        
    }
}
