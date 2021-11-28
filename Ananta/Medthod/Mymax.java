package Medthod;
import java.util.*;

public class Mymax {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int answerMax;
        int answerMin;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = scan.nextInt();
        System.out.println("Enter second number");
        num2 = scan.nextInt();

        answerMax = myMax(num1, num2);
        answerMin = myMin(num1, num2);

        System.out.println("Your max is "+answerMax);
        System.out.println("Your min is "+answerMin);
    }

    public static int myMax(int x, int y){

        if (x > y){
            return x;
        }else{
            return y;
        }


    }

    public static int myMin(int x, int y){

        if (x > y){
            return y;
        }else{
            return x;
        }


    }
}
