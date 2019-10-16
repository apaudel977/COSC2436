import java.util.Scanner;
import java.io.*;

public class Hashing {

    public static void main(String[] args) throws IOException
    {
        File file = new File("names.txt");
        Scanner infile = new Scanner(file);

        String[] Names = new String[1000];

        String Temp;
        while(infile.hasNext())
        {
            Temp = infile.next();
            Names[HashValue(Temp)%1000] = Temp;
        }

        System.out.println("What name to search for: ");
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        System.out.println(Names[HashValue(N)%1000]);
    }

    static int HashValue(String S)
    {
        int Value = 0;
        for (int i=0; i<S.length(); i++)
        //step through each character of temp
        {
            Value += S.charAt(i);
        }
        return Value;
    }


}
