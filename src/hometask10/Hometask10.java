package hometask10;

import utils.Helper;

public class Hometask10 {
    public static void main(String[] args) {
        double[] numbers = new double[10];

        System.out.println("task 1");
        Hometask10Fun.differenceSumEvenAndOddNumbers(Helper.fillArray(10, 1, 10));

        System.out.println("task 2");
        Hometask10Fun.swapItems();

        System.out.println("task 3");
        double[] arr = {2.3, 78.0, 4.3, 15.48, 0.1, 7.8};
        Helper.ShowArrayDouble(arr);
        Hometask10Fun.swapDouble(arr, Hometask10Fun.getMin(arr), Hometask10Fun.getMax(arr));
        Helper.ShowArrayDouble(arr);

        System.out.println("task 5");
        Hometask10Fun.reverseArray();
        System.out.println();

        System.out.println("task 6");
        int[] a1 = Helper.fillArray(3, 0, 2);
        int[] a2 = Helper.fillArray(3, 0, 2);
        Helper.ShowArray(a1);
        Helper.ShowArray(a2);
        Hometask10Fun.equalArrays(a1, a2);
    }
}

