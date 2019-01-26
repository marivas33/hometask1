package hometask8;


import utils.Helper;

public class ArrayFun {

    public static void countTailHead(int[] arr){
        int tail = 0;
        int head = 0;
        for (int e: arr) {
            if(e == 1){
                head++;
            }else {
                tail++;
            }
        }
        System.out.println("Head = "+head);
        System.out.println("Tail = "+tail);
    }

    public static void diagonal(){
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==j){
                    System.out.print("x");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }


    public static void sumArray(int[] arr) {
        int sum = 0;
        for (int el: arr) {
            sum += el;
        }
        System.out.println("Summ = " +sum);
    }

    public static void guessNumber(){
        int unknown = Helper.getRandom(1, 10);
        int number;
        do{
            System.out.println("Введите число от 1 до 10: ");
            number = Helper.getInputKeyboard();
            if(number<unknown){
                System.out.println("Попробуйте ввести число немного больше предыдущего.");
            }else if(number>unknown){
                System.out.println("Попробуйте ввести число немного меньше предыдущего.");
            }else{
                System.out.println("ПОЗДРАВЛЯЮ!! Вы угадали!");
            }
        }while (unknown != number);

    }
}
