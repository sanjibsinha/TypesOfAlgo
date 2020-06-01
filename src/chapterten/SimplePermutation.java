package chapterten;

/**
 * permutation is a combination of collections where order matters
 * permutation could be with repetition or without
 * here we see an example of
 * permutations without repetition
 * if there are 16 things, and if we choose 14
 * then we cannot choose 14 again
 * in that case, 15 things remain
 * no repetitions and order matters
 */

/**
 * Here is our problem:
 * what order could 5 balls be in
 * for 5 balls the possibility is factorial(5)
 * if we take any otwo out of it
 * the possibility is factorial(5 - 3)
 * but the order of 2 out of 5 balls
 * is factorial(5) / factorial(5 - 3)
 */

public class SimplePermutation {

    static int permutationWithoutRepetition(int n){
        int i = 1;
        int k = 1;
        while (i <= n){
            k *= i;
            i++;
        }
        //we get the factorial of the number we have passed as parameter
        return k;
    }

    public static void main(String[] args) {

        /**
         * the formula of permutation without repetition
         * is factorial(listOfNumbers)/factorial(listOfNumbers - restOfNumbers)
          */
        int listOfNumbers = 5;
        int restOfNumbers = 3;
        System.out.println("The list of numbers are (5, 4, 3, 2, 1)");
        System.out.println("Our first choice has 5 possibilities.");
        System.out.println("The number of orders 5 numbers could be in: ");
        System.out.println(permutationWithoutRepetition(5));
        System.out.println("Now we need any two numbers from this collection:");
        System.out.println("The order of 2 numbers out of 5 numbers could be: ");
        System.out.println(permutationWithoutRepetition(5)/permutationWithoutRepetition(3));

    }
}
