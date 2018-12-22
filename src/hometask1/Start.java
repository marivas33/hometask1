package hometask1;

public class Start {

   public static void main(String[] args){
       
       int addResult = Calculator.add(5 ,7);
       System.out.println(addResult);
       System.out.println(Calculator.add(7D, 5.3));

       int subResult = Calculator.sub(100, 35);
       System.out.println(subResult);
       System.out.println(Calculator.sub(13D, 5.7));

       int divResult = Calculator.div(200, 50);
       System.out.println(divResult);
       System.out.println(Calculator.div(45D, 5.5));

       int mulResult = Calculator.mul(33,3);
       System.out.println(mulResult);
       System.out.println(Calculator.mul(3D, 3.3));
    }

}
