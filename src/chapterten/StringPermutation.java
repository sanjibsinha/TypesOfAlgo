package chapterten;

/**
 * When repetition is allowed, we can rearrange the order
 * of a string in various combination
 * since we will keep the order with repetitions,
 * we can call it a permutation of a string
 */

public class StringPermutation {
    // we need a global recursive method
    // that will print all the permutations of the string
    static void arrangeTheStringWithRepetition(String anyString, String anotherString){

        // we need to check if the given string is empty
        if (anyString.length() == 0) {
            System.out.print(anotherString + " ");
            return;
        }

        for (int i = 0; i < anyString.length(); i++) {

            // reaching to the last character
            char ch = anyString.charAt(i);

            // we can display the rest of the character after
            // excluding the last character
            String restOfTheString = anyString.substring(0, i) +
                    anyString.substring(i + 1);

            // calling the method recursively
            arrangeTheStringWithRepetition(restOfTheString, anotherString + ch);
        }
    }

    public static void main(String[] args) {

        String stringToArrange = "abcd";
        // the given string 'abcd' is of length 4
        // factors of 4 is 4,3,2,1
        // factorial is 24
        // the program will rearrange the string 24 times
        arrangeTheStringWithRepetition(stringToArrange, " ");
        System.out.println();

    }

}
