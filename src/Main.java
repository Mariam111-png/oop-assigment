import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static Course searchCourse(String code) {
        for (Course c : CourseList.COURSES) {
            if (c.getCode().equals(code)) {
                return c;
            }
        }
        return null;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Total number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student type (0: general, 1: special): ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter student level: ");
            int level = sc.nextInt();

            Student s;
            if (type == 0) {
                s = new Student.GeneralProgrammStudent(name, id, level);
            } else {
                s = new Student.Special(name, id, level);
            }

            System.out.print("Number of courses to be registered: ");
            int numCourses = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < numCourses; j++) {
                System.out.print("Course " + (j+1) + " code: ");
                String code = sc.nextLine();

                Course c = searchCourse(code);
                if (c == null) {
                    System.out.println("Error: Course not found!");
                } else {
                    if (s.getLevel() < c.getLevel()) {
                        System.out.println("Error: You cannot register in this course");
                    } else {
                        System.out.print("Enter grade: ");
                        double grade = sc.nextDouble();
                        sc.nextLine();
                        s.registerClass(c, grade);
                    }
                }

            }

            students.add(s);
        }


        for (Student st : students) {
            System.out.println("\nStudent Info ");
            System.out.println("Name: " + st.name);
            System.out.println("ID: " + st.id);
            System.out.println("Level: " + st.getLevel());
            st.Register();
            System.out.println("Expenses: " + st.calc());
            System.out.println("GPA: " + st.getTotalGPA());
        }}
}

