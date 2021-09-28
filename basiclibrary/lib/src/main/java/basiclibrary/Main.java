package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Library callingFunc = new Library();

        int[] myArray = callingFunc.roll(4);
        System.out.println(Arrays.toString(myArray));
        System.out.println(callingFunc.containsDuplicates(myArray));
        System.out.println(callingFunc.average(myArray));

        int [][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println(Arrays.toString(callingFunc.lowestAverage(weeklyMonthTemperatures)));

        System.out.println(callingFunc.valuesNotInside(weeklyMonthTemperatures));

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = callingFunc.tally(votes);
        System.out.println(winner + " received the most votes!");
    }
}
