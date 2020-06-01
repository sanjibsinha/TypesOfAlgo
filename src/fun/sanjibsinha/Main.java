package fun.sanjibsinha;

public class Main {

    static int total;

    static int getTotal(int i){
        if (i != 0){
            total = i + getTotal(i - 1);
            return total;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("Total : " + getTotal(5));

    }
}
