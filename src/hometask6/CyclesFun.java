package hometask6;

public class CyclesFun {

    public static int countdown(int n){
        n = 10;
        do{
            System.out.println(n);
        }while (--n>0 );
        return n;
    }

    public static int factorial(int x){
         int y = 1;
         for(int i = 1; i<=x; i++){
             y = y*i;
             System.out.println(y);
         }
         return y;
    }

    public static void arithmeticProgression(int a1, int d, int n){
        for (int i = a1; i <=n ; i++) {
            a1 = a1 + d;
            System.out.print(a1+ " ");
        }

    }

}
