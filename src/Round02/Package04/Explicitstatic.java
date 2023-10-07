package Round02.Package04;

import Package03.PlantTools.PrintOptions;

class Cup{
    Cup(int marker){
        PrintOptions.prstring("Cup(" + marker + ")");
    }
    void f(int marker){
        PrintOptions.prstring("f(" + marker + ")");
    }
}
class Cups{
    static Cup c1;
    static Cup c2;
    static {
        c1 = new Cup(1);
        c2 = new Cup(2);
    }
    Cups(){
        PrintOptions.prstring("Cups()");
    }
}
public class Explicitstatic {
    public static void main(String[] args){
        PrintOptions.prstring("Inside main()");
        Cups.c1.f(99);
    }
    static Cups x = new Cups();
    static Cups y = new Cups();
}
