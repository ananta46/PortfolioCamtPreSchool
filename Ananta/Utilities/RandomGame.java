package Utilities;
import java.util.*;

public class RandomGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int guess = 0;
        int rand = 1 + r.nextInt(101);
        boolean giveUpCheck = false;

        System.out.println("Guess your number ");
        guess = scan.nextInt();

        while(guess != rand){

            if(rand > guess&& guess != 999){

                System.out.println(guess+" Is too less try again *type 999 to give up*");
                guess = scan.nextInt();
    
            }else if(rand < guess && guess != 999){
    
                System.out.println(guess+" Is too much try again *type 999 to give up*");
                guess = scan.nextInt();
    
            }
            else if(guess == 999){
    
                System.out.println("Why give up bro?");
                guess = rand;
                System.out.println("the number is "+rand);
                giveUpCheck = true;
    
            }
        }

        if(giveUpCheck){


        }else{

            System.out.println("Congrat woohoo! the number is "+rand);

        }
        

        

    }
}
