package Repetition;
import java.util.*;

public class Repetition1{

    public static void main(String[] args){
        
        int initial = 1;
        int totalDays = 30;
        int total = 0;
        int i = 0;

        total = total + initial;

        for(i = 2; i <= totalDays ; i++){
            total = total * 2;
        }

        System.out.println(total);

    }
}
