package Round02.Package03;

import Package03.PlantTools.PrintOptions;

public class CastingNumbers {
    public static void main(String[] args){
        double above = 0.7, below = 0.4;
        PrintOptions.prstring("above + above");
        PrintOptions.prstring("below + below");
        PrintOptions.prstring("(int)above: " + (int)above);
        PrintOptions.prstring("(int)below: " + (int)below);
        PrintOptions.prstring("(char)('a' + above): " + (char)('a' + above));
        PrintOptions.prstring("(char)('a' + below): " + (char)('a' + below));
    }
}
