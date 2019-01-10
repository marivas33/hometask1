package hometask5;

public class Calculator2 {

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
            System.out.println("ERROR!!!");
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
        return ((long)num)>>2;
    }

}
