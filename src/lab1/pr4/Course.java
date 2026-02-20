package lab1.pr4;

public class Course {
    private String name, desc, prereq; // List<Course>
    private int credit;
    public Course(String name, String desc, String prereq, int credit) {
        this.name = name;
        this.desc = desc;
        this.prereq = prereq;
        this.credit = credit;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return "Course: " + name + ", desc: " + desc + ", prereq: " + prereq + ", credit: " + credit;
    }
}
