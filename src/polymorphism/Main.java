package polymorphism;

public class Main {
    public static void main(String[] args){
        Polymorphism_Student my_student = new Polymorphism_Student("Si Nanan ");
        Polymorphism_Ariel my_Ariel = new Polymorphism_Ariel ("Ariel");
        Polymorphism_Zyrel my_Zyrel = new Polymorphism_Zyrel ("Zyrel");
        
        my_student.eat();
        my_Ariel.sleep();
        my_Zyrel.coding();
        
        System.out.println("---------------------------------------");
        
        my_student.tae();
        my_Ariel.studentCute();
        my_Zyrel.studentCute();
    }
}
