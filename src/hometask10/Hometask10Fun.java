package hometask10;

import utils.Helper;

public class Hometask10Fun {

    public static int differenceSumEvenAndOddNumbers(int[] arr){
        int sumEven = 0;
        int sumOdd = 0;
        int dif = 0;
        for (int i = 0; i<arr.length; i++) {
            if(arr[i]%2==0){
                sumEven += arr[i];
            }else{
                sumOdd += arr[i];
            }
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Сумма четных чисел = " + sumEven);
        System.out.println("Сумма нечетных чисел = " + sumOdd);

        if(sumEven>sumOdd){
            dif = sumEven - sumOdd;
            System.out.println("Разность четных и нечетных чисел = "+dif);
        }else if(sumEven<sumOdd){
            dif = sumOdd - sumEven;
            System.out.println("Разность четных и нечетных чисел = "+dif);
        }else{
            System.out.println("Сумма четных и нечетных чисел равна.");
        }
        return dif;
    }


    public static void swapItems(){
        char[] chArr = {'r', 'o', 'l', 'o', 'c'};
        System.out.println(chArr);
        Helper.swapChar(chArr, 0, chArr.length-1);
        System.out.println(chArr);
    }

    public static int getMin(double[] arr){
        int minIndex = 0;
        double min = arr[minIndex];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getMax(double[] arr){
        int maxIndex = 0;
        double max = arr[maxIndex];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void swapDouble(double[] doubleArr, int ind1, int ind2){
        double temp = doubleArr[ind1];
        doubleArr[ind1] = doubleArr[ind2];
        doubleArr[ind2] = temp;
    }

    public static void reverseArray(){
        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(a[i]+ " ");
        }
    }

    public static void equalArrays(int[] a1, int[] a2){
        boolean result = false;
        int length = a1.length;
        for (int i = 0; i < length; i++) {
                if (a1[i] == a2[i]){
                    result = true;
                }else {
                    result = false;
                }
            }
        System.out.println(result);
    }
}
