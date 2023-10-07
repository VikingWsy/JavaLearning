package Round02.Package04;

import Package03.PlantTools.PrintOptions;

class Rock{
    Rock(){
        PrintOptions.prstring("Create Rock");
    }
}
public class SimpleConstructor {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            new Rock();
        }
    }
}

