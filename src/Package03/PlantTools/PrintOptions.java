package Package03.PlantTools;

public class PrintOptions {
    public static void print(String s, int i) {
        System.out.println( s + " = " + i);
    }
    public static void prflt(String s, float f) {
        System.out.println( s + " = " + f);
    }
    public static void prstg(String s1, String s2) {
        System.out.println( s1 + " = " + s2);
    }
    public static void prbln(String s, boolean b) {
        System.out.println( s + " = " + b );
    }
    public static void prlng(String s, long l) { System.out.println( s + " = " + l );}
    public static void prchr(String s, char c) { System.out.println( s + " = " + c );}
}
