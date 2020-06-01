package chapterten;

import java.util.Scanner;

public class StringPermutationWithRepetition {

    // we need a global method to swap two characters
    // and return the string in a sequential array

    static String swappingCharacters(String aString, int i, int j){

        char aCharacter;

        char[] sequentialArray = aString.toCharArray();

        aCharacter = sequentialArray[i];

        sequentialArray[i] = sequentialArray[j];

        sequentialArray[j] = aCharacter;

        return String.valueOf(sequentialArray);

    }

    // a method to display every combination of arrangement of the string
    // in order, where repetition is allowed

    static void permuteAStringByRepeating(String aString, int start, int finish){

        if(start == finish){

            System.out.println(aString);

        }
        int i;

        for(i = start; i <= finish; i++){

            aString = swappingCharacters(aString, start, i);

            permuteAStringByRepeating(aString, start + 1, finish);

            aString = swappingCharacters(aString, start, i);

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to see all possible permutations where repetition is allowed: ");
        String enterAString;
        enterAString = sc.next();
        System.out.println("It arranges the string '" + enterAString + "' according to the number of factorials" +
                " of its length.");
        permuteAStringByRepeating(enterAString, 0, enterAString.length() - 1);
        System.out.println();
    }
}
