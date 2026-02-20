package lab1;

import p2.Student;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Course c1 = new Course("OOP", "Object Oriented Programming", "Programming Basics", 4);
        GradeBook gb = new GradeBook(c1);
        gb.displayMessage();

        gb.addStudent(new Student("A", 1));
        gb.addStudent(new Student("B", 1));
        gb.addStudent(new Student("C", 1));
        gb.addStudent(new Student("D", 1));
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < gb.getStudents().size(); i++) {
            System.out.print("Student " + gb.getStudents().get(i).getName() + ": ");
            int g = input.nextInt();
            gb.addGrade(g);
        }
        gb.displayGradeReport();
        input.close();
    }
}
