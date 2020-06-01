package fun.sanjibsinha.recursive;

public class AlgoRecursiveTwo {

    static int getFactorial(int f) {
        if (f == 0){
            return 1;
        }
        int tmp = f;
        for (int k = f-1; k>=1; k--){
            tmp = tmp * k;
        }
        return (tmp);
    }

    public static void main(String[] args) {
        int newNumber = 4, result;
        result = getFactorial(newNumber);
        System.out.printf("Factorial of " + newNumber + " = " + result);
        System.out.printf("");
    }
}
