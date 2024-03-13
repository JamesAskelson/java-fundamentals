public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).


        int temp = 2;

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if(temp >= 25){
            forecast = "It's pretty nice outside";
        } else if(temp >= 8){
            forecast = "Getting a lil chilly!";
        } else {
            forecast = "I am not going outside...";
        }

        System.out.println(forecast);
    }
}
