package package03.LearningCode;

import package03.PlantTools.PrintOptions;

import java.util.Random;

public class TestWhile {
    public static void main(String[] args){
        Random rand = new Random();
        int i = 0;
        while ( i < 30 ){
            i = rand.nextInt() % 100;
            PrintOptions.print( "i", i );
        }

    }
}
