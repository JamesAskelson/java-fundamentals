import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.
        System.out.print("Hi! Chose a number to count to: ");
        double number = scan.nextInt();

        for(int i = 0; i <= number; i++){
            System.out.print(i);
            System.out.print(' ');
        }
        scan.close();
    }
}
