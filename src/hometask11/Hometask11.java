package hometask11;

public class Hometask11 {
    public static void sortArray(){
        int[] arr = {3, 4, 1 ,8, 6, 7};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }

    }
}
