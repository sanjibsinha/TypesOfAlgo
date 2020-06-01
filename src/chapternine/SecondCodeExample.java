package chapternine;

import java.util.HashSet;
import java.util.Set;

public class SecondCodeExample {

    public static void main(String[] args) {

        Set<String> uniqueSet = new HashSet<String>();
        Set<String> duplicateSet    = new HashSet<String>();

        String[] ourArguments = {"I", "saw", "Mary", "I", "left", "Mary", "stayed"};
        for (String a : ourArguments){
            if (!uniqueSet.add(a)){
                duplicateSet.add(a);
            }
        }

        System.out.println("Applying Symmetric Difference abstraction : ");
        uniqueSet.removeAll(duplicateSet);

        System.out.println("Unique words in unique Set:    " + uniqueSet);
        System.out.println("Duplicate words in unique set: " + duplicateSet);

    }
}
