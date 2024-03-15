public class FizzBuzz {
    public static void main(String[] args) {

        // See Learn the Part for detailed instructions.
        for(int i = 0; i <= 18; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.err.println("FizzBuzz");
            } else if(i % 3 != 0 && i % 5 == 0) {
                System.err.println("Buzz");
            } else {
                System.err.println("Fizz");
            }
        }
    }

}
