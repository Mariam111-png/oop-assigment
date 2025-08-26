public class Course {


    private String NAME;

    public String getNAME() {
        return NAME;
    }

    private int hours;

    public int getHours() {
        return hours;
    }

    public Course(String NAME, int hours) {
        this.NAME = NAME;
        this.hours=hours;
    }

}

