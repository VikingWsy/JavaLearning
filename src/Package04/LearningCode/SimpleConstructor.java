package Package04.LearningCode;

import Package03.PlantTools.PrintOptions;

class Rock{
    Rock(int i){
        PrintOptions.print("Creating Rock", i);
    }
}
public class SimpleConstructor {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            Rock r = new Rock(i);
        }
    }
}
