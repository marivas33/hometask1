package hometask7;

import utils.Helper;

public class CyclesFun1 {

    public static int sumOfNumbers(int sum){
        sum = 0;
        for(int i = 1; i<=100; i++){
            sum = sum+i;

        }
        System.out.println("Сумма чисел от 1 до 100 = "+sum);
        return sum;
    }

    public static void oddNumbers(){
        for (int i = 1; i <100 ; i++) {
            if (i%2!=0){
                System.out.print(i+ " " );
            }
        }
        System.out.println();
    }

    public static void getAge(int age){
        System.out.println("Введите ваш год рождения");
       int year = Helper.getInputKeyboard();
       age = 2019 - year;
        System.out.println("Ваш возраст = " + age);
    }

}
