package Package04.LearningCode;

import Package03.PlantTools.PrintOptions;

public class Arrays_01 {
    public static void main(String[] args){
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = a1;
        for ( int i = 0; i < a2.length; i++)
            a2[i]++;
        for ( int i = 0; i < a1.length; i++ )
            PrintOptions.prstring("a1[" + i + "] = " + a1[i] );
    }
}
