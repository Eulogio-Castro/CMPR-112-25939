/**
 *
 * @author Eulogio Castro
 */


package RPS_Game;

import java.util.Random;
import java.util.Scanner;


public class RPS_Game {
public static void main (String[] args){ 
    
int looper = 1;
do{
       
   System.out.println("Can you defeat the computer?\n Let's find out.");
   System.out.println("Choose your weapon by entering a number:\n Rock(1)\t Paper(2)\t Scissors(3)");
  
   
   Scanner scan = new Scanner(System.in);       //User Input
   int weapon = scan.nextInt();
   
   if ((weapon != 1)&&(weapon!=2)&&(weapon!=3)) {  //If int 1,2, or 3 are not chosen, will restart loop, otherwise program fails
       System.out.println("\n");
       continue;}
   
   Random rand = new Random();                  //random pick for cpu choice, each loop
   int opponent = rand.nextInt(3) +1;
   
   
   
   
   if (opponent == 1){                                          //Outcome conditional statements
       System.out.println("The computer chose Rock!");
       if(weapon == 1){System.out.println("Draw Game!\n");}
       if(weapon == 2){System.out.println("You Win!\n");}
       if(weapon == 3){System.out.println("You Lose!\n");}
       }
   else if (opponent == 2){
       System.out.println("The computer chose Paper!");
       if(weapon == 2){System.out.println("Draw Game!\n");}
       if(weapon == 3){System.out.println("You Win!\n");}
       if(weapon == 1){System.out.println("You Lose!\n");}
       }
   else if (opponent == 3){
       System.out.println("The computer chose Scissors!");
       if(weapon == 3){System.out.println("Draw Game!\n");}
       if(weapon == 1){System.out.println("You Win!\n");}
       if(weapon == 2){System.out.println("You Lose!\n");}
       }
   else {System.out.println("I guess there will be no battle after all...\n");}
   } while (looper != 0);
   
 }
  
   
   
   
   
}
// Good job
