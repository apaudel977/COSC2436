package Homework2;

import java.util.Scanner;

public class sum {

    //169%10 = 9
    //169/10 = 16

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int n = console.nextInt();
        System.out.println("The sum of these digits is " + SumDigits(n));
    }

    static int SumDigits(int N)
    {
        //......
        if(N==0) return 0;
        return N%10 + SumDigits(N/10);

    }


}
