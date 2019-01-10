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
}
