package fun.sanjibsinha.recursive;

public class AlgoRecursiveThree {

    static int getFactorial(int f) {
        if (f == 0){
            return 1;
        } else {
            return (f * getFactorial(f - 1));
        }
    }

    public static void main(String[] args) {
        int newNumber = 4, result;
        result = getFactorial(newNumber);
        System.out.printf("Factorial of " + newNumber + " = " + result);
        System.out.printf("");

    }
}
