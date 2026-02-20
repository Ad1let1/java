package lab1;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Analyzer {
    public static void main(String[] args) {
        Data data = new Data();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter number (Q to quit):");
            if(sc.hasNextInt()) data.add(sc.nextInt());
            else{
                String input = sc.next();
                if (input.equals("Q")) break;
                else System.out.println("Enter big Q");
            }
        }
        System.out.println("Average: " + data.avg());
        System.out.println("Max: " + data.max());
        sc.close();
    }
}
