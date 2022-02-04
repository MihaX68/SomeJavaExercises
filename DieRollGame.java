package exercises;

import java.util.Random;

public class DieRollGame {
    public static void main(String args[]) {

        int currentSpace = 0;
        final int totalSpaces = 20;
        final int maxDiceRolls = 5;

        Random random = new Random();



        for (int i = 1; i <= maxDiceRolls; i++) {
            int die = random.nextInt(6) + 1;
            currentSpace += die;
            System.out.println(String.format("Roll#%d: You've rolled a %d. ", i, die));
            if(currentSpace == totalSpaces){
                System.out.println("You're on space "+ currentSpace + ". Congrats, you win!");
                break;
            }
            else if(currentSpace>totalSpaces){
                System.out.println("Unfortunately, that takes you past " + totalSpaces + " spaces. You lose!");
                break;
            }
            else if(i==maxDiceRolls && currentSpace<totalSpaces){
                System.out.println("You're on space "+ currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " + totalSpaces+ " spaces. You lose!");
            }
            else{
                int spacesLeft = totalSpaces - currentSpace;
                System.out.println("You are now on space " + currentSpace + " and have "+ spacesLeft + " more to go.");

            }
            System.out.println();


        }


    }
}

