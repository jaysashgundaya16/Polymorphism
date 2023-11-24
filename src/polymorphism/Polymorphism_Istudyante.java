package polymorphism;

public class Polymorphism_Student { //parent class
    String name;    
    Polymorphism_Student(String name){
        this.name = name;
    }    
    void eat(){
        System.out.println(name + " kay galisod ug libang");
    }    
    void sleep(){
        System.out.println(name + " kay galisod ug ginhawa pag makita siya sheessh");
    }    
    void tae(){
        System.out.println(name + " kay sig suka");
    }
    void coding(){
        System.out.println(name + " kay cute siya");
    }       
    public void studentCute(){
        System.out.println("Nagpa GWAPO si " + name);
    }
}
