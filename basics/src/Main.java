import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(4);
        flipNHeads(1);
        flipNHeads(6);

        clock();


    }

    public static String pluralize(String name, int counts) {

        if (counts > 1 || counts == 0) {
            return name + "s";
        } else {
            return name;
        }
    }

    public static void flipNHeads(int turns) {

         int counter = 0;

        for (int i = 0; i < turns; i++) {
            double randomNum = Math.random();
            if (randomNum >= 0.5) {
                System.out.println("heads");
                counter++;
            } else {
                System.out.println("tails");
                counter++;
            }
        }
        System.out.println("It took " + turns + pluralize(" flip", turns) + " to flip " + counter + " head in a row.");

    }

    public static void clock() {

        for (int i = 0; i >=0 ; i++) {
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
        }

    }
}
