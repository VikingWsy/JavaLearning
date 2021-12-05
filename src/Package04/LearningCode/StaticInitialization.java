package Package04.LearningCode;

import Package03.PlantTools.PrintOptions;

class Bow{
    Bow( int marker ){
        PrintOptions.prstring( "Bow( " + marker + " )");
    }
    void f( int marker ){
        PrintOptions.prstring( "f( " + marker + " )");
    }
}

class  Table{
    static Bow b1 = new Bow( 1 );
    Table(){
        PrintOptions.prstring( "Table()");
        b2.f(1);
    }

    void f2( int marker ){
        PrintOptions.prstring( "f2( " + marker + " )");
    }
    static Bow b2 = new Bow(2);
}

class Cupboard{
    Bow b3 = new Bow(3);
    static Bow b4 = new Bow(4);
    Cupboard(){
        PrintOptions.prstring("Cupboard()");
        b4.f(2);
    }
    void f3( int marker ){
        PrintOptions.prstring("f3( " + marker + " )");
    }
    static Bow b5 = new Bow(5);
}
public class StaticInitialization {
    public static void main(String[] args){
        PrintOptions.prstring( "Creating new Cupboard() in main");
        new Cupboard();
        PrintOptions.prstring( "Creating new Cupboard() in main");
        new Cupboard();
        t2.f2(1);
        t3.f3(1);
    }
    static Table t2 = new Table();
    static Cupboard t3 = new Cupboard();
}
