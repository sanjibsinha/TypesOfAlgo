package fun.sanjibsinha.recursive;

import java.util.Scanner;

public class AlgoRecursiveOne {

    static long i;

    static long getFactorial(long f) {
        if (f != 0)  // termination condition
            return f * getFactorial(f - 1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter any positive integer to know its factorial: ");
        i = sc.nextLong();
        long result;
        result = getFactorial(i);
        System.out.println(i + " factorial = " + result);

    }

}
