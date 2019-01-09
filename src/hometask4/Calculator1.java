package hometask4;

public class Calculator1 {

    public static float converter(float grn, float courseGrn){
        return grn/courseGrn;
    }

    public static int numbersSumm(int number, int sum, int digit){
        return  sum;
    }

    public static float farmFence(float l, float w){
        return (l+w)*2;
    }

    public static float farmLawn(float l1, float w1){
        return l1 * w1;
    }

    public static void trainDerailment(double v1, double v2){
        double time1, time2;
        time1 = 4/v1;
        time2 = 6/v2;
        if(time1 < time2){
            System.out.println("Поезда не столкнутся!");
        }else {
            System.out.println("Поезда столкнутся!!!");
        }
    }

    public static void quadraticEquation(double a, double b, double c){
        double D, x1, x2;
        D = Math.sqrt(b) - 4*a*c;
        if(D>0){
            x1 = (-b - Math.sqrt(D))/(2*a);
            x2 = (-b + Math.sqrt(D))/(2*a);
            System.out.println(" x1= " +x1 + " x2= " +x2);
        }else if(D==0){
            double x;
            x= -b/(2*a);
            System.out.println(" x= "+x);
        }else{
            System.out.println("ERROR");
        }
    }

    public static void seasonsOfIf(int n){
        if(n==3 || n==4 || n==5){
            System.out.println("ВЕСНА!");
        }else if(n==6 || n==7 || n==8){
            System.out.println("ЛЕТО!");
        }else if(n==9 || n==10 || n==11){
            System.out.println("ОСЕНЬ!");
        }else if(n==12 || n==1 || n==2){
            System.out.println("ЗИМА!");
        }else{
            System.out.println("Просили же, что только от 1 до 12!!!");
        }
    }

    public static void seasonsOfSwitch(int n1){
        switch (n1){
            case 1:
            case 2:
                System.out.println("ЗИМА!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ВЕСНА!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("ЛЕТО!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("ОСЕНЬ!");
            case 12:
                System.out.println("ЗИМА!");
                break;
            default:
                System.out.println("ERROR!!!");
        }
    }

    public static long bitDivByFour(double num) {
        int x1=100;
        System.out.println(x1>>2);
        int x2=32;
        System.out.println(x2>>2);
        int x3=8;
        System.out.println(x3>>2);
        int x4=6;
        System.out.println(x4>>2);
        int x5=4;
        System.out.println(x5>>2);
        int x6=3;
        System.out.println(x6>>2);
        int x7=1;
        System.out.println(x7>>2);
        return 0;
    }
}
