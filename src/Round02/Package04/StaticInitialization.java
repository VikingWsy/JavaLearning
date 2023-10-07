package Round02.Package04;

import Package03.PlantTools.PrintOptions;

class Bowl{
    Bowl(int marker){
        PrintOptions.prstring("Bowl(" + marker + ")");
    }
    void f(int marker){
        PrintOptions.prstring("f(" + marker + ")");
    }
}
class Table{
    static Bowl b1 = new Bowl(1);
    Table(){
        PrintOptions.prstring("Table()");
        b2.f(1);
    }
    void f2(int marker){
        PrintOptions.prstring("f2(" + marker + ")");
    }
    static Bowl b2 = new Bowl(2);
}
class Cupboard{
    Bowl b3 = new Bowl(3);
    static Bowl b4 = new Bowl(4);
    Cupboard(){
        PrintOptions.prstring("Cupboard()");
        b4.f(2);
    }
    void f3(int marker){
        PrintOptions.prstring("f3(" + marker + ")");
    }
    static Bowl b5 = new Bowl(5);
}
public class StaticInitialization {
    public static void main(String[] args){
        PrintOptions.prstring("Creating new Cupboard() in main");
        new Cupboard();
        PrintOptions.prstring("Creating new Cupboard() in main");
        new Cupboard();
        t2.f2(1);
        t3.f3(1);
    }
    static Table t2 = new Table();
    static Cupboard t3 = new Cupboard();
}
