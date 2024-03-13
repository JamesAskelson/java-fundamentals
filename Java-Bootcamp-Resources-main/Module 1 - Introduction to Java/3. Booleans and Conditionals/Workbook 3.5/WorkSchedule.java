public class WorkSchedule {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).

        int day = 3;   //3rd day of the week...
        boolean holiday = true;

        // IF - ELSE IF - ELSE HERE!
        if(holiday == true){
            System.out.println("WOOHOO, no work!");
        } else if(holiday == false && day > 5){
            System.out.println("It's the weekend, no work!");
        } else {
            System.out.println("Aw shit, here we go again");
        }

        }

    }
