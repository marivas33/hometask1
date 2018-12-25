package hometask2;

public class Calculator {

    public static int methodCalc1(int a, int b, int c){
        return a|b & (c>>1);
    }

    public static int methodCalc2(int a, int b){
        return (a<<a | b<<b)%2;
    }

    public static int methodCalc3(int a, int b, int c){
        return (a|b)/ (2&c) % 4|b;
    }

    public static int methodCalc4(int a, int b, int c){
        return (a^b|c)/(a|b)%c;
    }


}
