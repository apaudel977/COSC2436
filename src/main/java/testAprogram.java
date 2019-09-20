import java.io.BufferedReader;
import java.util.*;
public class testAprogram {

/*
    public static void main(String[] args) {
        System.out.println(Factorial(50));
    }

        static int Factorial(int x)
        {
            if(x==1)
                return 1;
            else
                return x * Factorial(x-1);

        }

 */

//fibonachi number calculation
/*
    public static void main(String[] args) {
        System.out.println(Fib(50));
    }

    static long Fib(int n)
    {
        if(n==1 || n==0) return 1;
        return Fib(n-1)+Fib(n-2);
    }

    */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many rabbits are in the line?");
        int n = console.nextInt();
        System.out.println(BunnyEars(n));
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
