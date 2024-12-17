public class parameter_con {
    @SuppressWarnings("FieldMayBeFinal")
    private String languages;

    public parameter_con(String lang) {
        this.languages=lang;
    }
    public String getLang(){
        return  this.languages;
    }
    
    
    public static void main(String[] args) {
        parameter_con p1=new parameter_con("Java");
        parameter_con p2=new parameter_con("Python");
        parameter_con p3=new parameter_con("C++");
        System.out.println("p1 languages:"+p1.getLang());
        System.out.println("p2 languages:"+p2.getLang());
        System.out.println("p3 languages:"+p3.getLang());
    }
}
