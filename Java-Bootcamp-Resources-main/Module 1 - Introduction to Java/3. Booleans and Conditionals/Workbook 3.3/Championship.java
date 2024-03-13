public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).

        int gryffindor = 150;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points
        int margin = gryffindor - ravenclaw;
        // int margin = amount of points by which gryffindor scored over ravenclaw;
        if(margin >= 300){
            System.out.println("Gryffindoor wins the tournament!");
        } else if(margin < 300 && margin >= 0){
            System.out.println("Gryffindoor comes in second!");
        } else if(margin < 0 && margin >= -100) {
            System.out.println("Gryffindoor came in third!");
        } else {
            System.out.println("Gryffindoor came in fourth!");
        }
    }
}
