package lab1;

public class Compiler {
    public static void main(String[] args) {
        Submission s1 = new Submission("code1", "Java");
        s1.grade(verdictShort.AC, 100);
        Submission s2 = new Submission("while(true);");
        s2.grade(verdictShort.TLE);
        s2.grade(verdictShort.WA);
        Submission.printCntAll();
        s2.printDetails();
    }
}
