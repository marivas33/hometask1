package hometask4;

import java.util.Scanner;


public class Start1 {
    public static void main(String[] args) {
        //currency converter
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в гривнах: ");
        float grn = scanner.nextFloat();
        System.out.println("Введите курс доллара в гривнах: ");
        float courseGrn = scanner.nextFloat();
        System.out.println("Сумма в долларах: "+ Calculator1.converter(grn, courseGrn));

        //calculating the sum of digits
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scanner1.nextInt();
        int sum = 0;
        int digit;
        digit = number%10;
        sum = sum + digit;

        number = number / 10;
        digit = number%10;
        sum =sum + digit;

        number = number/10;
        digit = number%10;
        sum = sum + digit;
        System.out.println("Сумма цифр = "+sum);


        //farm fence
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите длинну забора: ");
        float l = scanner2.nextFloat();
        System.out.println("Ведите ширину забора: ");
        float w = scanner2.nextFloat();
        System.out.println("Периметр забора = " +Calculator1.farmFence(l, w));

        //farm lawn
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите длинну газона: ");
        float l1 = scanner3.nextFloat();
        System.out.println("Ведите ширину газона: ");
        float w1 = scanner3.nextFloat();
        System.out.println("Площадь газона = " +Calculator1.farmLawn(l1, w1));


        //train derailment
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Скорость первого поезда = ");
        double v1 = scanner4.nextDouble();
        System.out.println("Скрость второго поезда = ");
        double v2 = scanner4.nextDouble();
        Calculator1.trainDerailment(v1, v2);


        //quadratic equation
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        double a = scanner5.nextDouble();
        System.out.println("Введите значение b: ");
        double b = scanner5.nextDouble();
        System.out.println("Введите значение c: ");
        double c = scanner5.nextDouble();
        Calculator1.quadraticEquation(a, b, c);


        //seasons of if
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 12: ");
        int n = scanner6.nextInt();
        Calculator1.seasonsOfIf(n);


        //seasons of switch
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Введите цифру от 1 до 12: ");
        int n1 = scanner7.nextInt();
        Calculator1.seasonsOfSwitch(n1);

        //division by four
        long num = Calculator1.bitDivByFour(0);
    }


}
