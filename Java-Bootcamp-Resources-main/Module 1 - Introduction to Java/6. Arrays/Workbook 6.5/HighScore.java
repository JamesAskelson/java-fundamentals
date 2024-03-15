import java.util.Random;

public class HighScore {
    public static void main(String[] args) {

        int highScore = 0;

        // Instructions for this workbook are on Learn the Part (Workbook 6.5).
        int[] scores = {randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum()};

        for(int i = 0; i < 10; i++){
            if(highScore == 0){
                highScore = scores[i];
            } else {
                if(highScore < scores[i]){
                    highScore = scores[i];
                }
            }
        }

        System.out.print("Here are the scores: ");
        for(int i = 0; i < 10; i++){
            System.out.print(scores[i]);
            System.out.print(" ");
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

    }



    public static int randomNum(){
        Random random = new Random();
        int randomNum = random.nextInt(49999) + 1;
        return randomNum;
    }
}
