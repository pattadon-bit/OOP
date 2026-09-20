package Lab1;
public class EmployeeTeamTest {
    public static void main(String[] args) {
        Employee teamBoss = new Employee("Anan", "Manager", 50000);
        Employee teamStaff = new Employee("Boon", "Staff", 20000);

        EmployeeTeam team = new EmployeeTeam(teamBoss, teamStaff);

        System.out.println("=== 1. Initial Team Details ===");
        team.printAllEmployeesDetails();

        System.out.println("\n=== 2. Updating Staff's Salary to 25000 ===");
        team.updateSalaryOfEmployee("Boon", 25000);
        team.printAllEmployeesDetails();

        System.out.println("\n=== 3. Giving 10% Raise to All Employees ===");
        team.giveRaiseToAllEmployees();
        team.printAllEmployeesDetails();
    }
}