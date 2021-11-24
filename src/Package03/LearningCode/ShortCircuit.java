package Package03.LearningCode;

import Package03.PlantTools.PrintOptions;

public class ShortCircuit {
    static boolean test1(int val){
        PrintOptions.print("test1 value < 1", val);
        return  val < 1;
    }

    static boolean test2(int val){
        PrintOptions.print("test2 value < 2", val);
        return val < 2;
    }

    static boolean test3(int val){
        PrintOptions.print("test3 value < 3", val);
        return val < 3;
    }


    public static void main(String[] args){
        if (test1(0) && test2(2) && test3(2))
            PrintOptions.prstg("Expression is ", "True");
        else
            PrintOptions.prstg("Expression is ", "False");
    }
}
