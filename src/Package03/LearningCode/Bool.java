package Package03.LearningCode;

import Package03.PlantTools.PrintOptions;

import java.util.Random;

public class Bool {
    public static void main(String[] args){
        Random rand = new Random();
        int i = rand.nextInt() % 100;
        int j = rand.nextInt() % 100;

        PrintOptions.print("i", i );
        PrintOptions.print("j", j );

        PrintOptions.prbln("i > j", i > j);
        PrintOptions.prbln("i < j", i < j );

        PrintOptions.prbln("i >= j", i >= j );
        PrintOptions.prbln("i <= j", i <= j );

        PrintOptions.prbln("i == j", i == j);
        PrintOptions.prbln("i != j", i != j );
    }
}
