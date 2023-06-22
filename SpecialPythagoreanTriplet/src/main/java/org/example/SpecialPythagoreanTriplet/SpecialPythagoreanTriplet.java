package org.example.SpecialPythagoreanTriplet;

public class SpecialPythagoreanTriplet {

    public static int potence(int number, int exponent){
        int result = 1;

        for (int counter = 0; counter < exponent; counter++) {
            result *= number;
        }

        return result;
    }

    public static boolean isANumber(String number){
        boolean isANumber = true;

        try {
            Integer.parseInt(number);
        }catch (Exception e){
            isANumber = false;
        }

        return isANumber;
    }

    public static int[] specialPythagoreanTriplet(int number){
        int result1 = 0;
        int result2 = 0;
        int product = 0;
        boolean isDone = false;
        for (int counter = 2; counter < number && !isDone; counter++) {
            for (int counter2 = 2; counter2 < counter && !isDone; counter2++) {

                product = potence(counter, 2) + potence(counter2, 2);
                isDone = product == number;

                if (isDone){
                    result1 = counter2;
                    result2 = counter;
                }
            }
        }

        return new int[]{result1, result2};
    }


}
