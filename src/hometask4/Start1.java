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
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();
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
        System.out.println("Введите длинну забора: ");
        float l = scanner.nextFloat();
        System.out.println("Ведите ширину забора: ");
        float w = scanner.nextFloat();
        System.out.println("Периметр забора = " +Calculator1.farmFence(l, w));

        //farm lawn
        System.out.println("Введите длинну газона: ");
        float l1 = scanner.nextFloat();
        System.out.println("Ведите ширину газона: ");
        float w1 = scanner.nextFloat();
        System.out.println("Площадь газона = " +Calculator1.farmLawn(l1, w1));


        //train derailment
        System.out.println("Скорость первого поезда = ");
        double v1 = scanner.nextDouble();
        System.out.println("Скрость второго поезда = ");
        double v2 = scanner.nextDouble();
        Calculator1.trainDerailment(v1, v2);


        //quadratic equation
        System.out.println("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите значение b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите значение c: ");
        double c = scanner.nextDouble();
        Calculator1.quadraticEquation(a, b, c);


    }


}
