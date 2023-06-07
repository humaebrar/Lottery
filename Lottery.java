package miniproject.miniproject01;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

    /*
       Project: Numerical Lotto Application

       Let n random numbers be generated for the ticket.
       Let the lottery result be generated with n random numbers.
       There should be no repeated numbers in the numerical lottery.

       Ask user to enter n(number of digits) also min and max values for numbers

       Compare result of matching digits and ticket, how many matches there are
       notify the user.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the total number of digits for the lottery");

        int numOfDigits = input.nextInt();
        System.out.println("Enter the minimum value you want to receive in the ticket");

        int min = input.nextInt();
        System.out.println("Enter the maximum value you want to receive in the ticket");

        int max = input.nextInt();

        int[] lottoArr = new int[numOfDigits];
        int[] ticketArr = new int[numOfDigits];

        Random random = new Random();

        int random1 = 0;
        int random2 = 0;

        boolean isRepeated;

        for (int i = 0; i < numOfDigits; i++) {
            random1 = random.nextInt(max + 1 - min) + min;  // max value given by the user will be included. [0-10]
            do {
                isRepeated = false;
                for (int j = 0; j < numOfDigits; j++) {

                    if (lottoArr[j] == random1) {
                        isRepeated = true;
                        break;
                    }
                }
            } while (isRepeated);
            lottoArr[i] = random1;

            do {
                isRepeated = false;
                for (int j = 0; j < numOfDigits; j++) {
                    if (lottoArr[j] == random1) {
                        isRepeated = true;
                        break;
                    }
                }

            } while (isRepeated);
            ticketArr[i] = random2;


        }


    }
}
