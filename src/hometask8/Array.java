package hometask8;

import utils.Helper;

public class Array {
    public static void main(String[] args) {

        int [] randomArray = Helper.fillArray(2000, 1, 0);
        ArrayFun.countTailHead(randomArray);


        ArrayFun.diagonal();


        int [] randomArray2 = Helper.fillArray(100, -10, 9);
        Helper.ShowArray(randomArray2);
        ArrayFun.sumArray(randomArray2);

        ArrayFun.guessNumber();
    }
}
