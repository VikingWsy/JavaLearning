package Round02.Package04;
import Package03.PlantTools.PrintOptions;

import java.util.*;

class Tree{
    int height;
    Tree(){
        PrintOptions.prstring("Planting a seeding");
        height = 0;
    }
    Tree(int i){
        PrintOptions.prstring("Creating new Tree that is " + i + " feet high");
    }
    void info(){
        PrintOptions.prstring("Tree is " + height + " feet tall");
    }
    void info(String s){
        PrintOptions.prstring(s + ": Tree is " + height + " feet tall");
    }
}
public class Overloading {
    public static void main(String[] args){
        for (int i = 0; i<5; i++){
            Tree t = new Tree(i);
            t.info();
            t.info("overloading method");
        }
        new Tree();
    }
}
