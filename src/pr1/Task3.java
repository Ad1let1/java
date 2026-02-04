package pr1;

public class Task3 {
    public static String getGrade(int grade){
        if(grade >= 95) return "A+";
        else if(grade >= 90) return "A";
        else if(grade >= 85) return "B+";
        else if(grade >= 80) return "B";
        else if(grade >= 75) return "C+";
        else if(grade >= 70) return "C";
        else if(grade >= 65) return "D+";
        else if(grade >= 60) return "D";
        else return "F";
    }
    public static void printGrade(int grade){
        System.out.println("Your grade: " + getGrade(grade));
    }
}
