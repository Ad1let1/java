package lab1.pr2;

enum verdictFull{ // CamelCase
    ACCEPTED, WRONG_ANSWER, TIME_LIMIT_EXCEEDED, RUNTIME_ERROR, COMPILATION_ERROR
}
enum verdictShort{
    AC, WA, TLE, RE, CE
}
public class Submission {
    static final int MaxMemory = 512;
    private static int cnt = 0;
    private final int id;
    private String code, lang;
    private verdictShort v;
    {
        cnt++;
        id = cnt;
        System.out.println("Submission created");
    }
    public Submission(String code, String lang) {
        this.code = code;
        this.lang = lang;
        this.v = null;
    }
    public Submission(String code){
        this(code, "CPP");
    }
    public Submission(String lang, verdictShort v){
        this.lang = lang;
        this.v = v;
    }
    public void grade(verdictShort v){
        this.v = v;
        System.out.println("Submission ID: " + this.id + " result: " + this.v);

    }
    public void grade(verdictShort v, int execTime){
        grade(v);
        System.out.println("Execution time: " + execTime + "ms");
    }
    public static void printCntAll(){
        System.out.println("Total submissions: " + cnt);
    }
    public void printDetails(){
        System.out.println("Submission Details:");
        System.out.println("Submission ID: " + this.id);
        System.out.println("Code: " + this.code);
        System.out.println("Language: " + this.lang);
        System.out.println("Verdict: " + this.v);
    }
}
