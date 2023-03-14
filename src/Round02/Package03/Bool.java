package Round02.Package03;
import java.util.*;
import Package03.PlantTools.*;
public class Bool {
    public static void main(String[] args){
        Random rand = new Random();
        int i = rand.nextInt() % 100;
        int j = rand.nextInt() % 100;
        PrintOptions.prstring("i = " + i);
        PrintOptions.prstring(("j = " + j));

        PrintOptions.prstring("i > j is " + (i > j));
        PrintOptions.prstring("i < j is " + (i < j));

        PrintOptions.prstring("i >= j is " + (i >= j));
        PrintOptions.prstring("i <= j is " + (i <= j));

        PrintOptions.prstring("i == j is " + (i == j));
        PrintOptions.prstring("i != j is " + (i != j));


    }
}
