package Homework4;

import java.util.*;
import java.util.ArrayList;
public class parentheses {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a string:");
        String uInput = console.nextLine();

        System.out.println(Balanced(uInput));

    }

    static boolean Balanced(String S)
    {
        Stack<Character> Pile = new Stack<Character>();
        for(int i = 0; i<S.length(); i++)
        {
            if(S.charAt(i)=='(' || S.charAt(i)== '[' || S.charAt(i) == '{')
            {
                Pile.push(S.charAt(i));
            }

            else if((S.charAt(i)==')' || S.charAt(i)== ']' || S.charAt(i) == '}') && Pile.isEmpty())
                return false;

            else if(S.charAt(i) == ')')
            {
                if(Pile.pop() != '(')
                    return false;
            }
            else if(S.charAt(i) == ']')
            {
                if(Pile.pop() != '[')
                    return false;
            }
            else if(S.charAt(i) == '}')
            {
                if(Pile.pop() != '{')
                    return false;
            }
        }
        if(Pile.isEmpty())
            return true;
        else
        return false;
    }

}
