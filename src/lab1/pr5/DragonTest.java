package lab1.pr5;

import lab1.pr5.Gender;

import java.util.ArrayList;
import java.util.Arrays;

public class DragonTest {
    public static void main(String[] args) {
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
