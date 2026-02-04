package pr1;

public class Task6 {
    public static boolean check(String s){
        int l = 0, r = s.length() - 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(r)){
                return false;
            }
        }
        return true;
    }
}
