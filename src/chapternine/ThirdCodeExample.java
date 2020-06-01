package chapternine;

import java.util.HashSet;
import java.util.Set;

public class ThirdCodeExample {

    public static void main(String[] args) {

        Set<String> hashSetExample = new HashSet<String>();
        hashSetExample.add("Sanjib");
        hashSetExample.add("Json");
        hashSetExample.add("John");
        hashSetExample.add("Sanjib");
        hashSetExample.add("Austin");
        hashSetExample.add("Bob");
        System.out.println("HashSet is an unordered list: ");
        System.out.println("HashSet also does not allow duplication; we will get one Sanjib: ");
        System.out.println(hashSetExample);
        System.out.println();
        for (String name : hashSetExample){
            System.out.println(name);
        }
        System.out.println();
        hashSetExample.forEach(System.out::println);
    }
}
