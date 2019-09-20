package Homework1;

import java.util.Scanner;
public class randomsum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a number: ");

        int N = console.nextInt();

        int A = 0, B = 0, C = 0, D = 0;

        while (A+ B + C + D != N)
            {
                A = (int) (Math.random()*N);
                B = (int) (Math.random()*N);
                C = (int) (Math.random()*N);
                D = (int) (Math.random()*N);
            }
        System.out.println();
        System.out.println("The following will add up to the number you entered: ");
        System.out.println(A + ", " + B + ", " + C + ", " + D);

        System.out.println();
        }
    }

