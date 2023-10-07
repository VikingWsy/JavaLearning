package Round02.Package04;

import Package03.PlantTools.PrintOptions;

import java.util.Random;

public class MultiDimArray {
    static Random rand = new Random();
    static int pRand(int mod){
        return Math.abs(rand.nextInt()) % mod + 1;
    }
    public static void main(String[] args){
        int[][] a1 = {
            { 1, 2, 3 },
            { 4, 5, 6 }
            };
        for (int i = 0; i < a1.length; i++){
            for (int j = 0; j < a1[i].length; j++){
                PrintOptions.prstring("a1[" + "i" + "][" + "j" + "] = " + a1[i][j] );
            }
        }

        int[][][] a2 = new int[2][2][4];
        for (int i = 0; i < a2.length; i++){
            for (int j = 0; j < a2[i].length; j++){
                for (int k = 0; k < a2[i][j].length; k++){
                    PrintOptions.prstring("a2[" + i + "][" + j + "][" + k + "] = " + a2[i][j][k]);
                }
            }
        }

        int[][][] a3 = new int[pRand(7)][][];
        for (int i = 0; i < a3.length; i++){
            a3[i] = new int[pRand(5)][];
            for (int j = 0; j < a3[i].length; j++){
                a3[i][j] = new int[pRand(5)];
            }
        }
        for (int i = 0; i < a3.length; i++){
            for (int j = 0; j < a3[i].length; j++){
                for (int k = 0; k < a3[i][j].length; k++){
                    PrintOptions.prstring("a3[" + i + "][" + j + "][" + k + "] = " + a3[i][j][k]);
                }
            }
        }
    }
}
