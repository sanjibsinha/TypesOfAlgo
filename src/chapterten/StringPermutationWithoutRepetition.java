package chapterten;

/**
 * When repetition is not allowed to arrange a given string
 * our scope is limited, consider an example
 * for a combination lock, where the given numbers are from
 * 0 to 10, and we are told to choose any three numbers,
 * we cannot use arrangement like 111
 */

public class StringPermutationWithoutRepetition {

    // we need a global method, where we will arrange a string
    // without repeating a sequence more than once
    static void displayingDistinctString(String anyString, String anotherString){

        // we need to check if the given string is empty
        if (anyString.length() == 0) {
            System.out.print(anotherString + " ");
            return;
        }

        // keeping in mind that we have 26 alphabets we need a
        // boolean array of size '26'
        boolean allAlphabets[] = new boolean[26];

        for (int i = 0; i < anyString.length(); i++) {

            // reaching to the last character
            char ch = anyString.charAt(i);

            // we can display the rest of the character after
            // excluding the last character
            String restOfTheString = anyString.substring(0, i) +
                    anyString.substring(i + 1);

            // it will check the repetition, if the character has already been used,
            // it will call the method recursively; else, there will be no recursive call
            if (allAlphabets[ch - 'a'] == false)
                displayingDistinctString(restOfTheString, anotherString + ch);
            allAlphabets[ch - 'a'] = true;
        }
    }

    public static void main(String[] args) {

        String stringToArrangeWithoutRepeating = "bbc";

        displayingDistinctString(stringToArrangeWithoutRepeating, " ");
        System.out.println();

    }
}
