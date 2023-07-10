import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student st = new Student();

        System.out.println("Name of the student?");
        st.name = sc.nextLine();

        System.out.println("Enter the three notes: ");
        st.gradeA = sc.nextDouble();
        st.gradeB = sc.nextDouble();
        st.gradeC = sc.nextDouble();

        System.out.println("FINAL GRADE = " + st.finalGrade());

        if (st.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.println("MISSING " + st.result() + " %.2f POINTS");
        } else {
            System.out.println("PASS");
        }
    }
}