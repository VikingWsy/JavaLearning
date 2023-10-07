package Round02.Package04;

import Package03.PlantTools.PrintOptions;

public class Flower {
    private int petalCount = 0;
    private String s = new String("null");
    Flower(int petals){
        petalCount = petals;
        PrintOptions.prstring("Constructor w/ int arg only, petaCount = " + petalCount);
    }
    Flower(String ss){
        PrintOptions.prstring("Constructor w/ String arg only, s= " + ss);
    }
    Flower(String s, int petals){
        this(petals);
        this.s = s;
        PrintOptions.prstring("String & args");
    }
    Flower(){
        this("hi", 47);
        PrintOptions.prstring("default constructor (no args)");
    }
    void print(){
        PrintOptions.prstring("petalCount = " + petalCount + " s = " + s);
    }
    public static void main(String[] args){
        Flower x = new Flower();
        x.print();
    }
}
