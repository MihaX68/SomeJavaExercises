package exercises;

import java.util.Scanner;

public class MadLibs {
    public static void main(String args[]){
        //Ask the user for a year;
        System.out.println("Enter a season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //Ask the user for a whole number;
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        //Ask the user for an adjective;
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        //Output the result;
        System.out.println("On a "+ adjective + " " + season + " day, I drink a minimum of " + number
        + " cups of coffee.");



    }
}
