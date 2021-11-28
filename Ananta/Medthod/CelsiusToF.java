package Medthod;
import java.util.*;
public class CelsiusToF {

    public static void main(String[] args) {
        double C = 40;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter celsius");
        C = scan.nextInt();
    
        System.out.println(cToF(C)+"Fahrenheit");
    }
    
    public static double cToF(double c) {
    return ((9.0/5.0)*c)+32;
        
    }
        
    
}
