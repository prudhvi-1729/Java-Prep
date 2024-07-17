package collections;

import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number);

        // closing the scanner object
        input.close();
        //printf
        System.out.printf("This is read integer from scanner %2d",number);
    }
}
