package package03.LearningCode;

import package03.PlantTools.PrintOptions;

public class LabeledFor {
    public static void main(String[] args){
        int i = 0;
        outer:
        for (;true;){
            inner:
            for ( ; i < 10; i++ ){
                PrintOptions.print( "i", i );
                if ( i == 2 ) {
                    PrintOptions.prstg("Continue", "Executed");
                    continue;
                }
                else if ( i == 3 ) {
                    PrintOptions.prstg("Break", "Executed");
                    break;
                }
            }

        }
    }
}
