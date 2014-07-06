import java.lang.System;

public class prob5 {

    public static int input;

    public static void main(String args[]) {

        System.out.print(findTrailingZeroInFactorial());
    }


    public static int findTrailingZeroInFactorial () {

        int number = 27;
        int numberOf5 = 0;
        int temp = 5;

        while (number / temp != 0) {

            numberOf5 += (number / temp);
            temp = temp * 5;

        }

        return numberOf5;
    }

}
