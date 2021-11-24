package Package03.LearningCode;

import Package03.PlantTools.PrintOptions;

public class LabeledFor {
    public static void main(String[] args){
        int i = 0;
        outer:
        for ( ; true ; ){
            inner:
            for ( ; i < 10; i++ ){
                PrintOptions.print( "i", i );
                if ( i == 2 ) {
                    PrintOptions.prstg("Continue", "Executed");
                    continue;
                }
                if ( i == 3 ) {
                    PrintOptions.prstg("Break", "Executed");
                    i++;
                    break;
                }
                if ( i == 7 ){
                    PrintOptions.prstg( "Continue", "outer");
                    i++;
                    continue outer;
                }
                if ( i == 8 ){
                    PrintOptions.prstg( "Break", "outer" );
                    break outer;
                }
                for ( int k = 0; k < 5; k++ ){
                    if ( k < 3 ){
                        PrintOptions.prstg( "Continue", "inner");
                        continue inner;
                    }
                }
            }

        }
    }
}
