package fun.sanjibsinha.recursive;

public class AlgoFibOne {

    static int getFibinacci(int f) {
        int k1, k2, k3;
        k1 = k2 = k3 = 1;
        for (int j = 3; j <= f; j++) {
            k3 = k1 + k2;
            k1 = k2;
            k2 = k3;
        }
        return k3;
    }

    public static void main(String[] args) {

        int newNumber = 6, result;
        result = getFibinacci(newNumber);
        System.out.printf("Fibonacci series of " + newNumber + " = " + result);
        System.out.printf("");
        System.out.printf("");
    }
}
