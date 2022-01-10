package Package04.LearningCode;

import Package03.PlantTools.PrintOptions;

import java.util.Random;

public class MultiDimArray {
    static Random rand = new Random();
    static int pRand(int mod){
        return Math.abs(rand.nextInt()) % mod + 1;
    }
    public static void main(String[] args){
        int[][] a1 = {
                {1,2,3},
                {4,5,6}
        };
        for (int i = 0; i < a1.length; i++)
            for (int j = 0; j < a1[i].length; j++)
                PrintOptions.prstring("a1[" + i + "][" + j + "] = " + a1[i][j]);

        int[][][] a2 = new int[1][2][3];
    }
}
