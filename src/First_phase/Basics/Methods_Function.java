package First_phase.Basics;

import java.util.Scanner;

public class Methods_Function {
    public static void main(String[] args) {
        int message=sum3(11,23);
        System.out.println(message);



        Scanner in =new Scanner(System.in);
        String namee=in.next();
        String name=myGreet(namee);
        System.out.println(name);

    }


    /*static String sum(){
        String greeting="hai";
        return greeting;
    }*/

    static int sum3(int a ,int b){
        int sum=a+b;
        return sum;
    }

    static String myGreet(String in){
        String message="hello "+ in;
        return message;
    }
}
