package chapternine;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FirstCodeSample {

    public static void main(String[] args) {

        int countingIntegers[] = {25, 44, 78, 1, 65, 3};
        Set<Integer> hashSet = new HashSet<Integer>();
        try {
            for(int i = 0; i < 5; i++) {
                hashSet.add(countingIntegers[i]);
            }
            System.out.println("HashSet does not sort the order: " + hashSet);

            TreeSet sortedTreeSet = new TreeSet<Integer>(hashSet);
            System.out.println("TreeSet sort the order based on values :");
            System.out.println(sortedTreeSet);
        }
        catch(Exception e) {}
    }
}
