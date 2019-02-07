package utils;

import java.util.Scanner;

public class Helper {
    public static int getInputKeyboard(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int getRandom(int min, int max){
            int r = (int) Math.round((max - min)*Math.random()) + min;
            return r;
    }

    public static double getDoubleRandom(double min, double max) {
        double r = (double) Math.round((max - min) * Math.random()) + min;
        return r;
    }

    public static int[] fillArray(int len, int min, int max){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Helper.getRandom(min, max);
        }
        return arr;
    }

    public static double[] fillDoubleArray(int len, double min, double max){
        double[] arr = new double[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Helper.getDoubleRandom(min, max);
        }
        return arr;
    }

    public static void ShowArray(int[] arr){
        for (int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void swap (int[] arr, int index1, int index2){
        int old = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = old;
    }

    public static void swapChar (char[] chArr, int index1, int index2){
        char old = chArr[index1];
        chArr[index1] = chArr[index2];
        chArr[index2] = old;
    }


    public static void ShowArrayDouble(double[] arr) {
        for (double e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
