package Round02.Package03;

public class DeepLoopBreak {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            if (i == 8) break;
            for (int j = 0; j < 3; j++){
                if (j<2) break;
            }
            System.out.println(i);
        }
    }
}
