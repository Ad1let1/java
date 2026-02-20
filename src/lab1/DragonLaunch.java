package lab1;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kpeople;
    public DragonLaunch (){
        this.kpeople = new Vector<>();
    }

    public void kidnap(Person p){
        kpeople.add(p);
    }
    public boolean willDragonEatOrNot(){
        int cntB = 0, cntK = 0;

        for (Person p : kpeople) {
            if (p.getGender() == Gender.boy) {
                cntB++;
            }
            else {
                if (cntB > 0) cntB--;
                else cntK++;
            }
        }
        cntK += cntB;
//        return cntK;
        return cntK > 0;
    }
}
