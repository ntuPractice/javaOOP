package Inheritance;
/*
The method in the superclass is being overridden by the subclass.
The method in the subclass is overriding the method in the superclass.*/
public class Animal {
//    Animal cosntructor
    Animal(){
        System.out.println("Hi I am an animal!");
    }

//    Parameterized constructor
    Animal(String name){
        System.out.println("I am an"+name);
    }
    //overriden method
    void displayInfo(){
        System.out.println("I am an animal");
    }
}

class Dog extends Animal{
//    use super keyword to called the constructor from the superclass
    /*super can only use in first line*/
    Dog(){
        super(" Jiwawa");
        System.out.println("I am girl!");
    }
    //overriding method in superclass
    void displayInfo(){
        System.out.println("I am a dog");
        super.displayInfo();
    }

}

class First{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.displayInfo();
    }
}
