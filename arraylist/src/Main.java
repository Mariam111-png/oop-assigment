import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Course M1=new Course("math",6);
        Course M2=new Course("English",8);

GeneralProgrammStudent S1=new GeneralProgrammStudent("MARIA",123,4);
S1.registerClass(M1,95);
        S1.registerClass(M2,85);
        S1.Register();

System.out.println("Expenses is " +S1.calc());
//Special N1=new Special("malak",768,2);
        System.out.println("GPA is " +S1.getTotalGPA());

//        System.out.println("Expenses is " +N1.calc());

}
    }
