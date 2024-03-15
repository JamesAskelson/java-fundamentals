import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        // See Learn the Part for the instructions.
        String line = scan.nextLine();

        printMessage(line);

    }

    public static void printMessage(String message){
        for(int i = 1; i <= 99; i++){
            System.err.println(i + ". " + message);
        }

    }
}
