import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee empl = new Employee();

        System.out.println("Name: ");
        empl.name = sc.nextLine();

        System.out.println("Gross Salary: ");
        empl.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        empl.tax = sc.nextDouble();

        System.out.println("Employee: " + empl);

        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        empl.increaseSalary(percentage);

        System.out.println("Updated data: " + empl);

        sc.close();
    }
}