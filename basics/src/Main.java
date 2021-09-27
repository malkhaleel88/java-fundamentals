import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(1);
        flipNHeads(2);

        clock();


    }

    public static String pluralize(String name, int counts) {

        if (counts > 1 || counts == 0) {
            return name + "s";
        } else {
            return name;
        }
    }

    public static void flipNHeads(int heads) {

         int counts = 0;
         int trials = 0;

        while (counts != heads){
            double randomNum = Math.random();
            if (randomNum >= 0.5) {
                System.out.println("heads");
                counts++;
            } else {
                System.out.println("tails");
                counts = 0;
            }
            trials++;
        }
        System.out.println("It took " + trials + pluralize(" flip", trials) + " to flip " + counts + pluralize(" head", trials) +" in a row.");

    }

    public static void clock() {

        LocalDateTime now = LocalDateTime.now();
        int preSecond = now.getSecond();
        double counter = 0;

        for (int i = 0; i >=0 ; i++) {

            now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int postSecond = now.getSecond();
            counter++;

            if (postSecond - preSecond == 1) {
                System.out.println(hour + ":" + minute + ":" + postSecond + " " + counter/1000000 + " MHz");
                preSecond++;
                counter = 0;
            }
        }
    }
}
