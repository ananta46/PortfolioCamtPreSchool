package Repetition;
import java.util.*;

public class NineTimesTable {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int temp = 0;
        String str = "";


        System.out.println("IXJ   0     1     2     3     4     5     6     7     8     9");

        for(i = 0;i <= 9;i++){
            str = i + "     ";
            for(j=0;j <= 9;j++){

            
            temp = i*j;
            if(temp > 9){
                str = str + (temp)+"    ";
            }else{
                str = str + (temp)+"     ";
            }
            
            }
            System.out.println(str);
        }
        

    }
}
