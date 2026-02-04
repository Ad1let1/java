package pr1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "Adilet";
        System.out.println(s);
        Scanner input = new Scanner(System.in);
        Task1.printName("Adilet");
//
        int x = input.nextInt();
        Task2.calculator(x);
//        int grade = input.nextInt();
//        System.out.println(task3.getGrade(grade));
//        System.out.println("Enter a, b and c:");
//        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
//        task4.getRoots(a, b, c);
//        double balance = input.nextInt();
//        double interestRate = input.nextDouble();
//        double balance  = 1000.0, interestRate = 3.0;
//        task5.addInterest(balance, interestRate);
//        String s = input.nextLine();
//        System.out.println(task6.check(s));
        input.close();
    }
}
