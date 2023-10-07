package Round02.Package04;

import Package03.PlantTools.PrintOptions;

public class Arrys {
    public static void main(String[] args){
        int[] a1 = {1,2,3,4,5};
        int[] a2;
        a2 = a1;
        for (int i = 0; i < a2.length; i++){
            a2[i]++;
        }
        for (int i = 0; i <a1.length; i++) {
            PrintOptions.prstring("a1[" + i + "] = " + a1[i] );
        }
    }
}
