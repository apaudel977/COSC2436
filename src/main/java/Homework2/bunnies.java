package Homework2;
import java.util.Scanner;

public class bunnies {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("How many bunnies are in the line? ");
        int numofbunnies = console.nextInt();
        System.out.println("This is a total of " + BunnyEars(numofbunnies) + " ears.");

    }

        static int BunnyEars(int N)
        {
            if(N==1)
                return 3;
            if(N%5 == 0)
                return 1 + BunnyEars(N-1);
            else if(N%2 == 0)
                return 2 + BunnyEars(N-1);
            else return 3 + BunnyEars(N-1);
        }


}
