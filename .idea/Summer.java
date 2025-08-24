public class Summer extends Course{
double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Summer(String name, String code, int level, int hours, double cost) {
        super(name, code, level, hours);
        this.cost=cost;
    }
}
