import java.util.Scanner;
public class Q2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        try {
            PSUStudent undergrad = new UndergradStudent(age, gpa);
            PSUStudent grad = new GradStudent(age, gpa);
            System.out.println("Objects created successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}