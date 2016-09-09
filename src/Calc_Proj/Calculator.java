/* 
    Eulogio Castro 
*/
package Calc_Proj;



import java.util.Scanner;
public class Calculator {
    
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
            double num1;
            double num2;
            int x = 1;
       do {
        System.out.printf("Enter the first number%n");
        num1 = input.nextDouble();
        
              System.out.printf("Choose an operator: +  - / *  (then hit enter)");
                 String operator = input.next();
            
              System.out.printf("Enter the Second Number%n");
              num2 = input.nextDouble();
              
              System.out.printf("Answer: ");
              double Answer;
              switch (operator){
                  case "+":{
                  Answer = num1 + num2;
                  System.out.println(Answer); break;}
                  case "-": {
                  Answer = num1 - num2;
                  System.out.println(Answer); break;}
                  case "/": {
                  Answer = num1 / num2;
                  System.out.println(Answer); break;}
                  case "*":{
                  Answer = num1 * num2;
                  System.out.println(Answer); break;}
              }
       } while (x <= 1);           

    }
}