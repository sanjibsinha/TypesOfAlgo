package fun.sanjibsinha.timecomplexity;

import java.util.Scanner;

public class TimeOne {

    static long userInput;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer to test prime or not: ");
        userInput = sc.nextInt();

        for (long i = 2; i < (userInput - 1); i++){
            if (userInput % i == 0){
                System.out.println(userInput + " is not prime.");
            } else {
                System.out.println(userInput + " is prime.");
            }
        }
    }
}
