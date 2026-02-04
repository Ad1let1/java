package pr1;

public class Task1 { // Task1 - PascalCase
    private static String getLines(int len){
        String result = "+";
        for (int i = 0; i < len; i++) {
            result += " ";
        }

        return "+" + "-".repeat(len) + "+\n";
    }
    public static void printName(String name){ // camelCase -> printName
        int x = name.length();
        String ans =  getLines(x) + "|%s|".formatted(name) + "\n" + getLines(x);
        System.out.println(ans);
    }
}
