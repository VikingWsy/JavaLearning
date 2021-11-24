package Package03.LearningCode;

import Package03.PlantTools.PrintOptions;

public class Testif {
    public static int Test( int teval ){
        int result = 0;
        if (teval > 0 )
            result = +1;
        else if (teval < 0)
            result = -1;
        else
            result = 0;
        return result;
    }
    public static void main(String[] args) {
        PrintOptions.print("result", Test(3));
    }
}
