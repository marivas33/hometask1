package hometask5;
import java.util.Scanner;

public class Start2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //seasons of if
        System.out.println("Введите цифру от 1 до 12: ");
        int n = scanner.nextInt();
        Calculator2.seasonsOfIf(n);


        //seasons of switch
        System.out.println("Введите цифру от 1 до 12: ");
        int n1 = scanner.nextInt();
        Calculator2.seasonsOfSwitch(n1);

        //division by four
        long bitDivByFour1 = Calculator2.bitDivByFour(100);
        System.out.println(bitDivByFour1);
        long bitDivByFour2 = Calculator2.bitDivByFour(32);
        System.out.println(bitDivByFour2);
        long bitDivByFour3 = Calculator2.bitDivByFour(8);
        System.out.println(bitDivByFour3);
        long bitDivByFour4 = Calculator2.bitDivByFour(6);
        System.out.println(bitDivByFour4);
        long bitDivByFour5 = Calculator2.bitDivByFour(4);
        System.out.println(bitDivByFour5);
        long bitDivByFour6 = Calculator2.bitDivByFour(3);
        System.out.println(bitDivByFour6);
        long bitDivByFour7 = Calculator2.bitDivByFour(1);
        System.out.println(bitDivByFour7);
    }

}
