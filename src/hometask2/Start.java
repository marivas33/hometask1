package hometask2;

public class Start {

    public static void main(String[] args) {

        int methodCalc1Result = Calculator.methodCalc1(2, 3, 4);
        System.out.println("Result = " + methodCalc1Result);

        int methodCalc2Result = Calculator.methodCalc2(2, 4);
        System.out.println("Result = " + methodCalc2Result);

        int methodCalc3Result = Calculator.methodCalc3(4, 3, 2);
        System.out.println("Result = " + methodCalc3Result);

        int methodCalc4Result = Calculator.methodCalc4(2, 4, 6);
        System.out.println("Result = " + methodCalc4Result);

        if(Calculator.methodParity(112)){
            System.out.println("This number is even");
        }else {
            System.out.println("This number is not even");
        }
      }
    }



