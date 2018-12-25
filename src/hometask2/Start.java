package hometask2;

public class Start {

    public static void main(String[] args) {

        int methodCalc1Result = Calculator.methodCalc1(2,3,4);//0010, 0011, 0100
        System.out.println("Result = "+methodCalc1Result);

        int methodCalc2Result = Calculator.methodCalc2(2,4);//0010, 0100
        System.out.println("Result = "+methodCalc2Result);

        int methodCalc3Result = Calculator.methodCalc3(4,3,2);//0100, 0011, 0010
        System.out.println("Result = "+methodCalc3Result);

        int methodCalc4Result = Calculator.methodCalc4(2,4,6);//0010, 0100, 0110
        System.out.println("Result = "+methodCalc4Result);

        //REMINDER FROM DIVISION TASK3
        int x = (int) (Math.random()* (100)) ;

        if (x%2 == 0){
            System.out.println(x+" - This number is even ");
        } else{
            System.out.println(x+" - This number not even ");
        }
    }
}
