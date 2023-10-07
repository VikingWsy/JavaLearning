package Round02.Package04;

import Package03.PlantTools.PrintOptions;

import java.util.Random;

public class ArryNew {
    static Random rand = new Random();
    static int pRand(int mod){
        return Math.abs(rand.nextInt()) % mod + 1;
    }
    public static void main(String[] args){
        int[] a;
        a = new int[pRand(20)];
        PrintOptions.prstring("Length of a = " + a.length);
        for (int i = 0; i < a.length; i++){
            PrintOptions.prstring("a[" + i + "] = " + a[i]);
        }
    }
}
