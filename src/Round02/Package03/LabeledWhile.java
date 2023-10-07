package Round02.Package03;

import Package03.PlantTools.PrintOptions;

public class LabeledWhile {
    public static void main(String[] args){
        int i = 0;
        outer:
        while (true){
            PrintOptions.prstring("Outer while loop");
            while (true){
                i++;
                PrintOptions.prstring("i = " + i);
                if (i==1){
                    PrintOptions.prstring("continue");
                    continue;
                }
                if (i==3){
                    PrintOptions.prstring("continue outer");
                    continue outer;
                }
                if (i==5){
                    PrintOptions.prstring("break");
                    break;
                }
                if (i==7){
                    PrintOptions.prstring("break outer");
                    break outer;
                }
            }
        }
    }
}
