package exercises;

import java.util.Scanner;

public class UnLeuCalculator {

    public static void main(String args[]){

        //Initialize what we know

        int bani50 = 50;
        int bani10 = 10;
        int bani5 = 5;
        int bani1 = 1;
        int unLeu = 100;


        //Get what we don't know
        System.out.println("Enter how many 50 de bani coins you have:");
        Scanner scanner = new Scanner(System.in);
        int numar50Bani = scanner.nextInt();

        System.out.println("Enter how many 10 bani coins you have:");
        int numar10Bani = scanner.nextInt();

        System.out.println("Enter how many 5 bani coins you have:");
        int numar5Bani = scanner.nextInt();

        System.out.println("Enter how many 1 ban coins you have:");
        int numar1Ban = scanner.nextInt();
        scanner.close();


        //Calculate
        int total = numar50Bani * bani50 + numar10Bani * bani10 + numar5Bani * bani5
                + numar1Ban * bani1;
        if(total < unLeu){
            int maiPutinCu = unLeu - total;
            System.out.println("Hopa! Iti mai trebuie " + maiPutinCu + " de bani ca sa ai un leu.");
        }
        else if(total > unLeu){
            int aiDepasitCu = total - unLeu;
            System.out.println("Hopa! Ai mai mult cu " + aiDepasitCu + " decat trebuie ca sa ai un leu.");
        }
        else
        {
            System.out.println("Felicitari! Ai exact 1 leu!");
        }




    }
}

