package hometask2;

public class Calculator {

    public static int methodCalc1(int a, int b, int c){
        return a+b * (c/2);
    }

    public static int methodCalc2(int a, int b){
        return (a*a + b*b)%2;
    }

    public static int methodCalc3(int a, int b, int c){
        return (a+b)/12*c%4+b;
    }

    public static int methodCalc4(int a, int b, int c){
        return (a-b*c)/(a+b)%c;
    }


    public static boolean methodParity(int x){
        int result = x%2;
        if(result == 0){
            return true;
        }else{
            return false;
        }
    }

}
