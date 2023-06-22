package org.example;

import org.example.SpecialPythagoreanTriplet.SpecialPythagoreanTriplet;

public class Main {
    public static void main(String[] args) {
        try {
            int number = 0;


            if (args.length != 1) {
                throw new Exception("Only can have got 1 argument");
            } else if (!SpecialPythagoreanTriplet.isANumber(args[0])) {
                throw new Exception("The argument " + args[0] + " is not a number");
            } else {
                number = Integer.parseInt(args[0]);
            }

            int[] factors = SpecialPythagoreanTriplet.specialPythagoreanTriplet(number);
            System.out.println("The Pythagorean Triplet of " + number + " are: " + factors[0] + "^2 + " + factors[1] + "^2 = " + number);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}