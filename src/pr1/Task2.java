package pr1;

public class Task2 {
    static void calculator(int x){
        int area = x*x, perimeter = 4*x;
        double diag = x*Math.sqrt(2);
        String ans = "Area: %d\nPerimeter: %d\nLength of diagonal: %.2f".formatted(area, perimeter, diag);
        System.out.print(ans);
    }
}
