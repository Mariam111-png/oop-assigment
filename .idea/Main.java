import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {


Course E1=new Course("mariam","123ret",8,3);

NormalCourse n1=new NormalCourse("mariam","123ret",8,3,5);

Summer s1=new Summer("mariam","123ret",8,3,4000);

        System.out.println(n1.getName());
        System.out.println(n1.getLevel());
        System.out.println(s1.getCost());
        System.out.println(E1.getHours());

        E1.setHours(5);
        System.out.println(E1.getHours());


    }






}