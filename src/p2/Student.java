// file: `java/Labs_Kbtu/src/p2/Student.java`
package p2;

public class Student {
    private String name;
    private int yearOfStudy, id;
    private static int count;
    public Student(String name, int yearOfStudy) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        count++;
        this.id = count;
    }
    public int getId() {
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void increment(){
        this.yearOfStudy++;
    }

}
