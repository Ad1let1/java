package pr1;

public class Task5 {
    static void addInterest(double balance, double interestRate) {
        double interest = balance * interestRate / 100.0;
        double newBalance = balance + interest;
        System.out.printf("Interest: %.2f\n", interest);
        System.out.printf("New Balance: %.2f\n", newBalance);
    }

}
