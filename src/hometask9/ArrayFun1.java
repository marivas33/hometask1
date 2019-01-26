package hometask9;

public class ArrayFun1 {

    public static void getIntMinMax(){
       int[] aIntNums = new int[] {-10, 20, 34, -11, 100, 20};
       int min = aIntNums[0];
        int max = aIntNums[0];
        for (int i = 0; i < aIntNums.length; i++) {
            if(min>aIntNums[i]){
                min = aIntNums[i];
            }
            if(max<aIntNums[i]){
                max = aIntNums[i];
            }
        }
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
    }

    public static void getDoubleMinMax(){
        double[] aDoubleNums = new double[] {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};
        double min = aDoubleNums[0];
        double max = aDoubleNums[0];
        for (int i = 0; i < aDoubleNums.length; i++) {
            if(max<aDoubleNums[i]){
                max = aDoubleNums[i];
            }
            if(min>aDoubleNums[i]){
                min = aDoubleNums[i];
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}
