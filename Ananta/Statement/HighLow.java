package Statement;
import java.util.*;

public class HighLow{
    
    public static void main(String[] args) {

        int num = 0;

        System.out.println("Input your value");
        Scanner input = new Scanner(System. in);
        num = input.nextInt();

        if (num < 500){
            System.out.println("Your number is not enough");
        }else{
            System.out.println("Your number is high enough5");
        }
        

    }
}