package fun.sanjibsinha.recursive;

public class AlgoFibTwo {

    static int getFibonacci(int f) {
        if ((f == 1) || (f == 2)){
            return 1;
        } else {
            return (getFibonacci(f - 1) + getFibonacci(f - 2));
        }
    }

    public static void main(String[] args) {

        int newNumber = 6, result;
        result = getFibonacci(newNumber);
        System.out.printf("Fibonacci series of " + newNumber + " = " + result);
        System.out.printf("");
        System.out.printf("");
    }

}
