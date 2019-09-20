package Homework2;

import java.util.Scanner;
public class recurse {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String s = console.nextLine();
        System.out.print("Your string in reverse: " + RevString(s));
        System.out.println();

    }
        //reverse string method

        static String RevString(String S)
        {
            if(S.equals("")) return "";
          return  S.substring(S.length() - 1) + RevString(S.substring(0,S.length()-1));
        }

}
