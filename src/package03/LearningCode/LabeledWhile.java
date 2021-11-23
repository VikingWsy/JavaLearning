package package03.LearningCode;

import package03.PlantTools.PrintOptions;

public class LabeledWhile {
    public static void main( String[] args){
        int i = 0;
        outer:
        while ( true ){
            PrintOptions.prstg( "Outer while", "loop");

            while ( true ){
                i++;
                PrintOptions.print( "i = ", i );
                if ( i == 1 ){
                    PrintOptions.prstg( "Continue", "executed");
                    continue;
                }
                if ( i == 3 ){
                    PrintOptions.prstg( "Continue outer", "executed" );
                    continue outer;
                }
                if ( i == 5 ){
                    PrintOptions.prstg( "Break", "executed" );
                    break;
                }
                if ( i == 7 ){
                    PrintOptions.prstg( "Break outer", "executed");
                    break outer;
                }
            }
        }
    }
}
