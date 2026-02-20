package lab1;
import p2.Student;
import java.util.ArrayList;
public class GradeBook {
    private Course course;
    private ArrayList<Student> students;
    private ArrayList<Integer> grades;
    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void displayMessage(){
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public double determineClassAverage() {
        if (grades.isEmpty()) return 0.0;
        int total = 0;
        for (int g : grades) {
            total += g;
        }
        return (double) total / grades.size();
    }
    
    private void printStars(int[] freq){
        int n = freq.length;
        for (int i = 0; i < n; i++) {
            if(i == 10){
                System.out.println("100: " + "*".repeat(freq[i]));
            }
            else{
                System.out.println(i*10 + "-" + (i*10+9) + ": " + "*".repeat(freq[i]));
            }
        }
        
    }
    public void outputBarChart() {
        System.out.println("\nGrades distribution:");

        int[] freq = new int[11];
        for (int i = 0; i < grades.size(); i++) {
            if(grades.get(i) == 100) freq[10]++;
            else freq[grades.get(i) / 10]++;
        }
        printStars(freq);
    }

    public void displayGradeReport() {
        int max = -1, min = 101;
        Student best = null, worst = null;
        for (int i = 0; i < grades.size(); i++) {
            int g = grades.get(i);
            Student s = students.get(i);
            if (g > max) {
                max = g;
                best = s;
            }
            if (g < min) {
                min = g;
                worst = s;
            }
        }

        System.out.printf("Class Average is %.2f\n", determineClassAverage());
        System.out.println("Lowest grade is " + min + " (" + worst + ")");
        System.out.println("Highest grade is " + max + " (" + best + ")");

        outputBarChart();
    }
}
