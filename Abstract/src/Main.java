

abstract class Language {
    /*Abstract class can have both regular method and abstract method*/
    Language(){
        System.out.println("Constructor of abstract class");
    }
    /*Abstract method is a method that does not have its body*/
    /*If a class have abstract method it should be declared as abstract*/
    abstract void speak();

    void method2() {
        System.out.println("This is regular method.");
    }

    static void sing(){
        System.out.println("Wei shen me a");
    }
}

/*class that extend abstract class must implement the abstract method*/
class Modern_Language extends Language{
    /*access the cosntructor of abstract class using super*/
    Modern_Language(){
        System.out.println("Constructor of Modern Language class");
    }
    void speak() {
        System.out.println("Me Llamo Wei");
    }
}

class Chinese_language extends Language{
    void speak(){
        System.out.println("Ni Hao Wo Hui Han Yu Pin Yin");
    }
}

public class Main {
    public static void main(String[] args) {
//        Will call the constructor of parent class directly then called the constructor of its own class!!!
    Language lang1=new Modern_Language();
    Language lang2=new Chinese_language();
    lang1.speak();
    lang2.speak();
    Language.sing();
    }

}