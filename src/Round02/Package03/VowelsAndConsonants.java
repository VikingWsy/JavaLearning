package Round02.Package03;

import Package03.PlantTools.PrintOptions;

public class VowelsAndConsonants {
    public static void main(String[] args){
        for (int i = 0; i < 100; i++){
            char c = (char)(Math.random() * 26 + 'a');
            PrintOptions.prstring(c + ": ");
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    PrintOptions.prstring("vowel");
                case 'y':
                case 'w':
                    PrintOptions.prstring("Sometimes a vowel");
                default:
                    PrintOptions.prstring("consonant");
            }
        }
    }
}
