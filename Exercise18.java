import java.util.Scanner;

/*
*Steven Allen
*ITSE-1302
*5/2/2017
*Exercise 18
*Code that programs an arbitrary numbers of integers that are in the range 0 to 50 inclusive, 
*and counts how many occurrence of each are entered.
*/

public class IntegerCounter {
    
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int[] intInteger = new int[51];

        System.out.println("Enter an integer >= 0 and <= 50 [Enter -1 to quit]: ");
        int intNumber = scan.nextInt();

        while (intNumber != -1 && intNumber >= 0 && intNumber <= 50) {
            intInteger[intNumber]++;
            intNumber = scan.nextInt();
        }
        for (int index = 0 ; index<=50 ; index++) {
            if (intInteger[index] > 0) {
                System.out.println(index+ " : " + intInteger[index]);
     }
}