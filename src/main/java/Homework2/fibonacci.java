package Homework2;
import java.util.*;

public class fibonacci {

    static int methodCount = 0;

    static long fibNum(int n)
    {
        methodCount++;
        if(n<=1)
            return n;
            return fibNum(n-1)+fibNum(n-2);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Which Fibonacci number would you like to calculate?");
        int fn = console.nextInt();
        long startTime = System.nanoTime();
        System.out.println("This Fibonacci number = " + fibNum(fn));
        long endTime = System.nanoTime();
        System.out.println("Number of method calls made = " + methodCount);
        System.out.println("Seconds used for this calculation = " + ((endTime - startTime)/1000000000));
    }

}
