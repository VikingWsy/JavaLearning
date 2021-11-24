package Package04.LearningCode;

import Package03.PlantTools.PrintOptions;

class Tree{
    int height;
    Tree(){
        PrintOptions.prstring("Planting a seed");
        height = 0;
    }

    Tree(int i){
        PrintOptions.prstring("Creating new Tree that is " + i + " feet tall");
        height = i;
    }

    void info(){
        PrintOptions.prstring("Tree is " + height + " feet tall");
    }

    void infos(String s) {
        PrintOptions.prstring(s + ": Tree is " + height + " feet tall");
    }
}
public class OverLoading {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            Tree t = new Tree(i);
            t.info();
        }
    }
}
