package Statement;
import java.util.*;

public class NestedIfStatement{

    public static void main(String[] args) {

        Scanner input = new Scanner(System. in);

        int choice = 0;

        System.out.println("Welcome to OOP Lab");
        System.out.println("\t1. menu 1");
        System.out.println("\t2. menu 2");
        System.out.println("\t3. menu 3");
        System.out.println("\t4. menu 4");
        System.out.println("\t5. menu 5");

        choice = input.nextInt();

        if(choice == 1){

            System.out.println("\tWelcome to menu 1");

        }else if(choice == 2){

            System.out.println("\tWelcome to menu 2");

        }else if(choice == 3){

            System.out.println("\tWelcome to menu 3");

        }else if(choice == 4){

            System.out.println("\tWelcome to menu 4");

        }else if(choice == 5){

            System.out.println("\tWelcome to menu 5");

        }else{
            System.out.println("\tPls enter value properly");
        }


        
    }

}