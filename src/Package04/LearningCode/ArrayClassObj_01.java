package Package04.LearningCode;

import Package03.PlantTools.PrintOptions;

import java.util.Random;

public class ArrayClassObj_01 {
    static Random rand = new Random();
    static int pRand(int mod){
        return Math.abs(rand.nextInt()) % mod + 1;
    }
    public static void main(String[] args){
        Integer[] a = new Integer[pRand(20)];
        PrintOptions.prstring("length of a = " + a.length);
        for (int i = 0; i < a.length; i++){
//            a[i] = new Integer(pRand(500));
            PrintOptions.prstring("a[" + i + "] =" + a[i]);
        }
    }
}
