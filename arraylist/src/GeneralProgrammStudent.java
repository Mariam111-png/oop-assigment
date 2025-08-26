public   class     GeneralProgrammStudent  extends Student {

    public GeneralProgrammStudent(String name, int id, int level) {
        super(name, id, level);
    }
    @Override




    public  float calc(){

        return level*1000;
    }


}
