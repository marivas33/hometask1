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

    public static int[] fillArray(int len, int min, int max){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Helper.getRandom(min, max);
        }
        return arr;
    }

    public static void ShowArray(int[] arr){
        for (int e: arr) {
            System.out.printf("[%d] ", e);
        }
        System.out.println();
    }

}
