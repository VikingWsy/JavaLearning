package Package04.LearningCode;

import Package03.PlantTools.PrintOptions;

class A_01{ int i; }

public class VarArgs_01 {
    static void f(Object[] x){
        for (int i = 0; i < x.length; i++)
            System.out.println(x[i]);
    }

    public static void main(String[] args){
        f(new Object[]{
                new Integer(47), new VarArgs_01(),
                new Float(3.14), new Double(11.11)
        });

        f(new Object[]{
                "one", "two", "three"
        });
        f(new Object[]{new A_01(), new A_01(), new A_01()});
    }
}
