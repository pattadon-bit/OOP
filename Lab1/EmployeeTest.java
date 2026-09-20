package Lab1;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Somchai", "Jaidee", 30000);
        System.out.println("Employee 1: " + emp1.getFirstName() + " " + emp1.getLastName());
        System.out.println("Initial Monthly Salary: " + emp1.getMonthlySalary());

        emp1.setMonthlySalary(-5000);
        System.out.println("Salary after trying negative value: " + emp1.getMonthlySalary());

        Employee e1 = new Employee("Alice", "Smith", 20000);
        Employee e2 = new Employee("Bob", "Johnson", 25000);

        System.out.println("\n--- Yearly Salary Before Raise ---");
        System.out.println(e1.getFirstName() + "'s Yearly Salary: " + e1.getYearlySalary());
        System.out.println(e2.getFirstName() + "'s Yearly Salary: " + e2.getYearlySalary());

        e1.giveRaise();
        e2.giveRaise();

        System.out.println("\n--- Yearly Salary After 10% Raise ---");
        System.out.println(e1.getFirstName() + "'s Yearly Salary: " + e1.getYearlySalary());
        System.out.println(e2.getFirstName() + "'s Yearly Salary: " + e2.getYearlySalary());
    }
}