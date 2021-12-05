package Package04.LearningCode;

import Package03.PlantTools.PrintOptions;

class Chair{
    static boolean gcrun = false;
    static boolean f = false;
    static int created = 0;
    static int finalized = 0;
    int i;

    Chair(){
        i = ++created;
        if ( created == 47 )
            PrintOptions.prstring( "Created 47");
    }

    protected void finalize(){
        if (!gcrun){
            gcrun = true;
            PrintOptions.prstring( "Beginning to finalize after " + created + " Chairs have been created");
        }
        if ( i == 47 ){
            PrintOptions.prstring( "Finalizing Chair #47, " + "Setting flag to stop Chair creation");
            f= true;
        }
        finalized++;
        if ( finalized >= created )
            PrintOptions.prstring( "All " + finalized + " finalized");
    }
}
public class Garbage {
    public static void main( String[] args ){
        if ( args.length == 0 ){
            PrintOptions.prstring( "Usage: \n" + "java Garbage before\n or:\n" + "java Garbage after");
            return;
        }
        while ( !Chair.f ){
            new Chair();
            new String( "To take up space" );
            PrintOptions.prstring( "After all Chairs have been created: \n" + "total created =" + Chair.finalized );
            if ( args[0].equals("before")){
                PrintOptions.prstring("gc()");
                System.gc();
                PrintOptions.prstring("runFinalized:");
                System.runFinalization();
            }
            if (args[0].equals("after")){
//                System.runFinalizersOnExi
            }
        }
    }
}
