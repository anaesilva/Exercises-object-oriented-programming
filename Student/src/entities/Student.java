package entities;

public class Student {

    public String name;
    public double gradeA;
    public double gradeB;
    public double gradeC;

    public double finalGrade() {
        return gradeA + gradeB + gradeC;
    }

    public double result() {
     if (finalGrade() < 60.0) {
         return 60.0 - finalGrade();
     } else {
         return 0.0;
     }
    }
}
