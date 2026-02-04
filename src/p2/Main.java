
package p2;

public class Main {
    public static void main(String[] args) {
//        Student adilet = new Student("Adilet", 20);
//        System.out.println(adilet.getName());
//        StarTriangle small = new StarTriangle(1);
//        System.out.println(small.toString());
        Time t1 = new Time(18, 32, 20);
        System.out.println(t1.toStandard());
        System.out.println(t1.toUniversal());
        Time t2 = new Time(1, 30, 59);
        t1.add(t2);
        System.out.println(t2.toUniversal());
        System.out.println(t1.toUniversal());
    }
}




