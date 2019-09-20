import java.util.*;

public class alarm {

    //just a class practice for the first test Programming Fundamental III
    public static void main(String[] args) {
        ArrayList<Integer> Gnomes = new ArrayList<Integer>();   //open and close parenthesis will be used if constructor

        //how to create elements inside the array?
        //since its a object

        Gnomes.add(101);
        Gnomes.add(58);
        Gnomes.add(73);
        Gnomes.add(12);
        Gnomes.remove(1);
        Gnomes.set(0,88);
        System.out.println("Size = "+ Gnomes.size());
        System.out.println(Gnomes.get(0));
        System.out.println(Gnomes.get(Gnomes.size()-1));

        //big o is the method of computing the efficiency of algorithm
        //recursion is not the fastest way to solves the problem.
        //calls itself with the remaining problem
        //dividing and solving the problem


        //memorize the big O's notation

        //the recursive fibonacci takes long time as per the big O's notation
        //the yellow line is a simple for loop that goes to n;



    }


}
