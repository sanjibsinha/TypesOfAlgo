package chapterten;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test {

    // Function to swap two characters

    static String swap(String str, int i, int j){

        char ch;

        char[] array = str.toCharArray();

        ch = array[i];

        array[i] = array[j];

        array[j] = ch;

        return String.valueOf(array);

    }

    // Function to print all the permutations of the string

    static void permute(String str,int low,int high){

        if(low == high)

            System.out.println(str);



        int i;

        for(i = low; i<=high; i++){

            str = swap(str,low,i);

            permute(str, low+1,high);

            str = swap(str,low,i);

        }

    }

    // Function to read user input

    public static void main(String[] args) {

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String str;

        System.out.println("Enter a string");

        try{

            str = sc.next();

        }catch (Exception e){

            System.out.println("An error occurred");

            return;

        }

        System.out.println("All the possible permutations of "+ str + "are");

        permute(str,0,str.length()-1);

    }

}

