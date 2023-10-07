package Round02.Package03;

import Package03.PlantTools.PrintOptions;

public class LabelFor {
    public static void main(String[] args){
        int i = 0;
        outer:
        for (; true;){
            int f = 1;
            inner:
            for (; i < 10; i++){
                PrintOptions.prstring( "i = " + i);
                if (i == 2){
                    PrintOptions.prstring("continue");
                    continue;
                }
                if (i == 3){
                    PrintOptions.prstring("break");
                    i++;
                    break;
                }
                if (i == 7){
                    PrintOptions.prstring("continue outer");
                    i++;
                    continue outer;
                }
                if (i==8){
                    PrintOptions.prstring("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++){
                    if (k==3){
                        PrintOptions.prstring("continue inner");
                        continue inner;
                    }
                }
            }
        }

    }
}
