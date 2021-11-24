package Package03.LearningCode;

import Package03.PlantTools.PrintOptions;

public class CastingNumbers {
    public static void main( String[] args ){
        double above = 0.7, below = 0.4;
        PrintOptions.print( "(int)above:", (int) above );
        PrintOptions.print( "(int)below:", (int) below );

        PrintOptions.prchr( "(char)('a' + above)", (char) ('a' + above));
        PrintOptions.prchr( "(char)('a' + below)", (char) ('a' + below));
    }
}
