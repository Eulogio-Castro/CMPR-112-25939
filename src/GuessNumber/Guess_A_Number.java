package GuessNumber;

import java.lang.String;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eulog
 */
public class Guess_A_Number {
    public static void main (String[] args){
        int sentinel; 
        int guessTotal=0;
        int guessRight=0;
        int guessWrong=0;
        double guessPercent;
 do{
    System.out.printf("Let's play a game!%nGuess a number between 1 and 10%n");   
    Scanner scan = new Scanner(System.in);   
    Random rand = new Random();       
    
    int randnum = rand.nextInt(10) +1;      //random number generated   
    int guessnum = scan.nextInt();          //captures guess from user       

    boolean boundry;

    if ((guessnum <= 10)&& (guessnum >=1)){     boundry = true;}
    else {boundry = false;}

    if((randnum == guessnum)&& (boundry)){       
        System.out.printf("Wow! You got it!%n");
        guessRight++;
            }
    
    else { System.out.printf("Sorry, You Lose!%n");
        guessWrong++;
            } 
    
    guessTotal++;
    
    guessPercent= (double)guessRight / guessTotal;
    System.out.printf("Your current correct guess rate is "+guessPercent*100+"%% %n");
    
    System.out.printf("Would you like to play again?%nEnter \"Y\" to play again%n");
    String decision = scan.next();
    if (decision.toUpperCase().equals("Y")){
        sentinel = 0;}
    else{
        sentinel=1;}
     System.out.printf("%n%n");
    
    
    } while (sentinel != 1);
    
    System.out.printf("Maybe another time?%nYou're final Correct Guess Rate was "+guessPercent+"%%,%nwith "
            + "a total of "+ guessRight+" correct guesses,%nand "+ guessWrong +" incorrect guesses%n");
    System.out.printf("Good Bye!");
    }
}
