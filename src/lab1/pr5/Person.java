package lab1.pr5;


enum Gender{
    boy, girl
}
public class Person {
    private String name;
    private Gender gender;
    public Person(String name, Gender gender){
        this.name = name;
        this.gender = gender;
    }
    public Gender getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
//        if(this.gender == gender.boy){
//            return this.name + " (b)";
//        }else{
//            return this.name + " (g)";
//        }
        return this.name + " (" + this.gender + ")";
    }
}
