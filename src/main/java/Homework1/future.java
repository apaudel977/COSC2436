package Homework1;

import java.util.*;
import java.lang.Math;

public class future {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How much will you save monthly?");
        double savedAmt = console.nextDouble();

        System.out.println("How many years will you save?");
        double time = console.nextDouble();

        System.out.println("Annual interest rate percentage?");
        double apr = console.nextDouble();

        double finalApr = ((apr/12)/100);
        double finalTime = time*12;

        double futureValue = savedAmt*((((Math.pow((1+finalApr),finalTime))-1)/finalApr)*(1+finalApr));

        System.out.printf("After "+ time + " years, your investment will worth $%.3f", futureValue);
        System.out.println();
        System.out.println();
    }
}
