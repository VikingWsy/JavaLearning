package Round02.Package04;

import Package03.PlantTools.PrintOptions;

class Tag{
    Tag(int marker){
        PrintOptions.prstring("Tag(" + marker + ")");
    }
}
class Card{
    Tag t0 = new Tag(0);
    Card(){
        Tag t1 = new Tag(1);
        PrintOptions.prstring("Card()");
        t3 = new Tag(33);
    }
    Tag t2 = new Tag(2);
    void f(){
        PrintOptions.prstring("f()");
    }
    Tag t3 = new Tag(3);
}
public class OrderOfInitialization {
    public static void main(String[] args){
        Card t = new Card();
        t.f();
    }
}
