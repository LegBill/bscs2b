package activity4_legaspi;
import java.util.Scanner;


public class Activity4_Legaspi {
    public static void main(String[] args) {
       Scanner mem = new Scanner (System.in);
       System.out.println("Hi! Please enter what would you like to do: ");
       System.out.println(" [1] if from Celsius to Fahrenheit \n [2] if from Fahrenheit to Celsius ");
       int choice = mem.nextInt();
       switch(choice)
       {
           case 1: 
               Scanner cf = new Scanner (System.in);
               System.out.println("You have Chosen C to F! Now, type your number: ");
               double inp=cf.nextDouble();
               double CtoF=(inp * 9/5) + 32 ;
               System.out.println("The answer is "+CtoF);
               break;
           case 2:
               Scanner fc = new Scanner (System.in);
               System.out.println("You have chosen F to C! Now, tyoe your number: ");
               double inpu=fc.nextDouble();
               double FtoC=(inpu-32) * 5/9;
               System.out.println("The answer is "+FtoC);

               

               
       }
    
}

    private static String ParseInt(double CtoF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
