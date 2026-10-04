package Lab3;
public class Fulltimer extends Employee {
    private double salary;

    public Fulltimer(String n, double s) {
        salary = s;
        name = n;
    }

    @Override
    public double computePay() {
        return salary;
    }
}