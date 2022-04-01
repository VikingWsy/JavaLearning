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
        for (int i = 0; i < a2.length; i++)
            for (int j = 0; j<a2[i].length; j++)
                for (int k = 0; k < a2[i][j].length; k++)
                    PrintOptions.prstring("a2[" + i + "][" + j + "][" + k + "] = " + a2[i][j][k]);

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
                    a3[i][j][k] = pRand(100);
                    PrintOptions.prstring("a3[" + i + "][" + j + "][" + k + "] = " + a3[i][j][k]);
                }
            }
        }

        String[][] a4 = {
                {new String("1"), new String("2")},
                {new String("3"), new String("4")},
                {new String("5"), new String("6")}
        };
        for (int i = 0; i < a4.length; i++){
            for (int j = 0; j<a4[i].length; j++){
                PrintOptions.prstring("a4[" + i + "][" + j + "] = " + a4[i][j]);
            }
        }

        Integer[][] a5;
        a5 = new Integer[3][];
        for (int i = 0; i < a5.length; i++){
            a5[i] = new Integer[3];
            for (int j = 0; j < a5[i].length; j++){
                a5[i][j] = i * j;
                PrintOptions.prstring("a5[" + i + "][" + j + "] = " + a5[i][j]);
            }
        }

    }
}
