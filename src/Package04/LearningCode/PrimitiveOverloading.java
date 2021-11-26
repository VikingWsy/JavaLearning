package Package04.LearningCode;

import Package03.PlantTools.PrintOptions;

public class PrimitiveOverloading {
    void f1(char x){
        PrintOptions.prstring("f1(char)");
    }
    void f1(byte x){
        PrintOptions.prstring("f1(byte)");
    }
    void f1(short x){
        PrintOptions.prstring("f1(short)");
    }
    void f1(int x){
        PrintOptions.prstring("f1(int)");
    }
    void f1(long x){
        PrintOptions.prstring("f1(long)");
    }
    void f1(float x){
        PrintOptions.prstring("f1(float)");
    }
    void f1(double x){
        PrintOptions.prstring("f1(double)");
    }

    void f2(byte x){
        PrintOptions.prstring("f2(byte)");
    }
    void f2(short x){
        PrintOptions.prstring("f2(short)");
    }
    void f2(int x){
        PrintOptions.prstring("f2(int)");
    }
    void f2(long x){
        PrintOptions.prstring("f2(long)");
    }
    void f2(float x){
        PrintOptions.prstring("f2(float)");
    }
    void f2(double x){
        PrintOptions.prstring("f2(double)");
    }

    void f3(short x){
        PrintOptions.prstring("f3(short)");
    }
    void f3(int x){
        PrintOptions.prstring("f3(int)");
    }
    void f3(long x){
        PrintOptions.prstring("f3(long)");
    }
    void f3(float x){
        PrintOptions.prstring("f3(float)");
    }
    void f3(double x){
        PrintOptions.prstring("f3(double)");
    }

    void f4(int x){
        PrintOptions.prstring("f4(int)");
    }
     void f4(long x){
        PrintOptions.prstring("f4(long)");
    }
    void f4(float x){
        PrintOptions.prstring("f4(float)");
    }
    void f4(double x){
        PrintOptions.prstring("f4(double)");
    }

    void f5(long x){
        PrintOptions.prstring("f5(long)");
    }
    void f5(float x){
        PrintOptions.prstring("f5(float)");
    }
    void f5(double x){
        PrintOptions.prstring("f5(double)");
    }

    void f6(float x){
        PrintOptions.prstring("f6(float)");
    }
    void f6(double x){
        PrintOptions.prstring("f6(double)");
    }

    void f7(double x){
        PrintOptions.prstring("f7(double)");
    }

    void testConstVal(){
        PrintOptions.prstring( "Testing with 5");
        f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);
    }

    void testChar(){
        char x = 'x';
        PrintOptions.prstring( "char argument");
        f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
    }

    public static void main(String[] args){
        PrimitiveOverloading p = new PrimitiveOverloading();
        p.testConstVal();
        p.testChar();
    }
}
