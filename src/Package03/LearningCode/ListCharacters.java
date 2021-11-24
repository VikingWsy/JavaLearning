package Package03.LearningCode;

import Package03.PlantTools.PrintOptions;

public class ListCharacters {
    public static void main(String[] args){
        for (int i = 0; i < 40; i++)
            if (i != 26 & i != 30)
                PrintOptions.print( "i", i );
    }
}
