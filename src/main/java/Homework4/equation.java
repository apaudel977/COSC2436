package Homework4;

import java.util.*;
import java.util.ArrayList;
public class equation {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a string:");
        String uInput = console.nextLine();

        System.out.println(Evaluate(uInput));

    }

    static int Evaluate(String S) {
        Stack<Integer> Value = new Stack<Integer>();
        Stack<Character> Operator = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= '0' && S.charAt(i) <= '9') {
                Value.push(Character.getNumericValue(S.charAt(i)));
            }
            // System.out.println(Value.peek());
            else if (S.charAt(i) == '(' || S.charAt(i) == '+' || S.charAt(i) == '-')
                Operator.push(S.charAt(i));
            else if (S.charAt(i) == ')') {
                int V1 = Value.pop();
                int V2 = Value.pop();
                char Op = Operator.pop();
                if (Op == '+')
                    Value.push(V2 + V1);
                else if (Op == '-')
                    Value.push(V2 - V1);
                Operator.pop();
            }
        }
//put while loop here
        /*    //while the operator stack is not empty
            while (!Operator.isEmpty()) {
                char op = Operator.pop();
                int V3 = Value.pop();
                int V4 = Value.pop();
                if(op == '+')
                    Value.push(V4 + V3);
                else if(op == '-');
            }

         */
            return Value.pop();
        }

}
