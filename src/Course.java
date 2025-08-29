public class Course {
    String name;
    String code;
    int level;
    int hours;

    public Course() {}

    public Course(String name, int level, int hours) {
        this.name = name;
        this.level = level;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getLevel() {
        return level;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Code: " + code +
                ", Name: " + name +
                ", Credit Hours: " + hours +
                ", Min Level: " + level;
    }
}


class NormalCourse extends Course {
    int rules;

    public NormalCourse(String name, int level, int hours) {
        super(name, level, hours);
        this.code = name + "_N" + level;
    }

    public NormalCourse(String name, int level, int hours, int rules) {
        super(name, level, hours);
        this.code = name + "_N" + level;
        this.rules = rules;
    }
}


class SummerCourse extends Course {
    double cost;

    public SummerCourse(String name, int level, int hours) {
        super(name, level, hours);
        this.code = name + "_S" + level;
    }

    public SummerCourse(String name, int level, int hours, double cost) {
        super(name, level, hours);
        this.code = name + "_S" + level;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
