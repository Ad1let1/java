package pr1;

public class Task4 {
    public static void getRoots(int a, int b, int c){
        int d = b * b - 4 * a * c;
        if(d < 0){
            throw new Error("Negative Discriminant");
        }
        if(d == 0){
            float r = ((float)(-b) / (2.f * a));
            System.out.println(r);
        }
        else{
            float r1 = ((float)(-b + Math.sqrt(d)) / (2.f * a));
            float r2 = ((float)(-b - Math.sqrt(d)) / (2.f * a));
            System.out.println(r1 + "\n"  + r2);
        }
    }
}
