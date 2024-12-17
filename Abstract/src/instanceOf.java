public class instanceOf {
    /*In java this keyword refer to current obj of the method or a constructor*/
    int value;
    instanceOf(int value){
       this.value=value;
        System.out.println("this reference: "+this);
    }

    public static void main(String[] args) {
        instanceOf obj1=new instanceOf(5);
        System.out.println("Object reference: "+obj1);
        instanceOf obj2=new instanceOf(9);
        System.out.println("Object reference: "+obj2);
    }

}
