public  class Special extends Student {


    public Special(String name, int id, int level) {
        super(name, id, level);
    }

@Override
    public  float calc(){


    int totalCredits = 0;
    for (int i = 0; i < numOfCourses; i++) {
        totalCredits += courseList[i].getHours();
    }
    // expenses = sum of credit hours * 500
    return totalCredits * 500f;
}

    }
