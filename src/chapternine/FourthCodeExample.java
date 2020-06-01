package chapternine;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FourthCodeExample {

    public static void main(String[] args) {

        Set<String> hashSetExample = new HashSet<String>();
        hashSetExample.add("Sanjib");
        hashSetExample.add("Json");
        hashSetExample.add("John");
        hashSetExample.add("Sanjib");
        hashSetExample.add("Austin");
        hashSetExample.add("Bob");
        System.out.println("Unordered HashSet output of names: ");
        System.out.println(hashSetExample);
        System.out.println();
        TreeSet sortedTreeSet = new TreeSet<String>(hashSetExample);
        System.out.println("TreeSet has sorted the order based on values :");
        System.out.println(sortedTreeSet);
    }
}
