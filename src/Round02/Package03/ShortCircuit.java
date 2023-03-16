package Round02.Package03;
import Package03.PlantTools.*;
public class ShortCircuit {
    static boolean test1(int val){
        PrintOptions.prstring("test1(" + val + ")");
        PrintOptions.prstring("result: " + (val < 1));
        return val < 1;
    }
    static boolean test2(int val){
        PrintOptions.prstring("test2(" + val + ")");
        PrintOptions.prstring("result: " + (val < 2));
        return val < 2;
    }
    static boolean test3(int val){
        PrintOptions.prstring("test3(" + val + ")");
        PrintOptions.prstring("result: " + (val < 3));
        return val < 3;
    }
    public static void main(String[] args){
        if(test1(0) && test2(2) && test3(3))
            PrintOptions.prstring("expression is true");
        else
            PrintOptions.prstring("expression is false");
    }
}
