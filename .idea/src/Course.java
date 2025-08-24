public class Course {
String name;
    String code;

    int level;

    int hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }



    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void Course(String name,
                       String code,
                       int level,
                       int hours
        ){

        this.name=name;
        this.code=code;
        this.level=level;
        this.hours=hours;




    }












}
