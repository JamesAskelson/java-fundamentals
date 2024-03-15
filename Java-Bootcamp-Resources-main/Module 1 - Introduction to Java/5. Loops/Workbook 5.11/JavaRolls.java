import java.util.Scanner;
import java.util.Random;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.

        int diceRoll;
        int score = 0;
        System.err.println("Let's play rolling java. Type anything to start");
        scan.nextLine();
        System.err.println("Great. Here are the rules:\n");
        System.err.println("- If you roll a 6, the game stops");
        System.err.println("- If you roll a 4, nothing happens");
        System.err.println("- Otherwise, you get 1 point.\n");
        System.err.println("You must collect at least 3 points to win. Enter anything to roll:");

        while(score < 3){
            diceRoll = diceRoll();
            System.err.println("You have rolled: " + diceRoll);
            if(diceRoll == 6){
                System.err.println("End game");
                break;
            } else if(diceRoll == 4) {
                System.err.println("You got 0 point! " + score + " points. Keep rolling");
                continue;
            } else {
                score++;
                System.err.println("You got 1 point! " + score + " points. Keep rolling");
            }

        }

        if(score == 3){
            System.err.println("You won!");
        } else {
            System.err.println("You lost :(");
        }
    }

    public static int diceRoll(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }



}
