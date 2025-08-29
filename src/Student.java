

public abstract class Student {


    String name;
    int id;
    int level;
    double[] grades;
    Course[] courseList;
    int numOfCourses;

    public int getLevel() {
        return level;
    }

    public Student(

            String name,
            int id,
            int level

    ) {
        this.name = name;
        this.id = id;
        this.level = level;
        this.grades = new double[6];
        this.courseList = new Course[6];
        this.numOfCourses = 0;


    }

    public void Register() {

        System.out.println("the courses for  " + name);
        for (int i = 0; i < numOfCourses; i++) {

            System.out.println("grades is= " + grades[i]);
            System.out.println("course name is =  " + courseList[i].getName());

        }
    }

    public abstract float calc();

    public boolean registerClass(Course course,double grade) {
        if (numOfCourses < 6) {

            courseList[numOfCourses] = course;
            grades[numOfCourses]=grade;

            numOfCourses++;


            return true;}
        else {

            System.out.println("no more than 6 courses");



            return false;}

    }

    public double getCourseGPA(double grade){
        if(grade>=98){
            return 0.4;
        }
        else if (grade >= 93) return 4.0;
        else if (grade >= 90) return 3.7;
        else if (grade >= 87) return 3.3;
        else if (grade >= 83) return 3.0;
        else if (grade >= 80) return 2.7;
        else if (grade >= 77) return 2.3;
        else if (grade >= 73) return 2.0;
        else if (grade >= 70) return 1.7;
        else if (grade >= 67) return 1.3;
        else if (grade >= 63) return 1.0;
        else if (grade >= 60) return 0.7;
        else return 0.0;
    }


    public double getTotalGPA(){
        {
            double totalPoints = 0;
            int totalCredits = 0;

            for (int i = 0; i < numOfCourses; i++) {
                double courseGPA = getCourseGPA(grades[i]);
                totalPoints += courseGPA * courseList[i].getHours();
                totalCredits += courseList[i].getHours();
            }

            return (totalCredits == 0) ? 0 : totalPoints / totalCredits;
        }

    }
    static class   GeneralProgrammStudent  extends Student {

        public  GeneralProgrammStudent(String name, int id, int level) {
            super(name, id, level);
        }
        @Override




        public  float calc(){

            return level*1000;
        }


    }
    static class Special extends Student {


        public  Special(String name, int id, int level) {
            super(name, id, level);
        }

        @Override
        public  float calc(){


            int totalCredits = 0;
            for (int i = 0; i < numOfCourses; i++) {
                totalCredits += courseList[i].getHours();
            }

            return totalCredits * 500f;
        }

    }

}

