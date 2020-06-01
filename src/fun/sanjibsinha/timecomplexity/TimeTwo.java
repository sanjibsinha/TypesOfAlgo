package fun.sanjibsinha.timecomplexity;

import java.util.Scanner;

public class TimeTwo {
    static double userInput;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer to test prime or not: ");
        userInput = sc.nextInt();

        // 10 to the power 6 + 3 = 1000003
        for (long i = 2; i < (Math.sqrt(userInput)); i++){
            if (userInput % i == 0){
                System.out.println(userInput + " is not prime.");
            } else {
                System.out.println(userInput + " is prime.");
            }
        }
    }

}
