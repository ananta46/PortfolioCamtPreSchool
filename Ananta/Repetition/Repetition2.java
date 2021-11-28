package Repetition;
import java.util.*;

public class Repetition2 {
    public static void main(String[] args) {
        
        int totalDays = 0;
        int total = 0;
        int i = 0;

        for(i = 1; i <= 1000000 ; i=i*2){
            totalDays++;        
        }
        
        System.out.println(totalDays);

    }
    
}
