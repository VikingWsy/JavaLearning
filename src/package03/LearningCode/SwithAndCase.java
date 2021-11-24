package package03.LearningCode;

import package03.PlantTools.PrintOptions;

public class SwithAndCase {
    public static void main( String[] args ){
        char c = ( char ) ( Math.random() * 26 + 'a' );

        double d = Math.random();
        d = d * 26;
        d = d + 'a';
        PrintOptions.prchr( "Test c + :", c );
        switch ( c ){
            case 'a': PrintOptions.prstg( "a", "is executed"); break;
            case 'e':
            case 'i':
            case 'o':
            case 'u': PrintOptions.prstg( "u", "is executed"); break;
            default: PrintOptions.prstg( "Default", "is executed");
        }
    }
}
