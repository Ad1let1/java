package lab1;
import p2.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1: Data, Analyzer

        // 2: Submission, Compiler
        // 3:
//        Temperature t1 = new Temperature();
//        System.out.println(t1.getC());
//        System.out.println(t1.getF());
//        Temperature t2 = new Temperature(212, 'F');
//        System.out.println(t2.getScale());
//        System.out.println(t2.getF());
//        System.out.println(t2.getC());
//        t2.setAll(100, 'C');
//        System.out.println(t2.getAll());

        /* ------------------------*/
        // 5:
        DragonLaunch dragon = new DragonLaunch();
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Adilet", Gender.boy),
                new Person("Aizhan", Gender.boy),
                new Person("Aibek", Gender.boy),
                new Person("Ainura", Gender.girl)
            )
        );
        for(Person p : people){
                dragon.kidnap(p);
        }
        System.out.println(dragon.willDragonEatOrNot());


    }
}
