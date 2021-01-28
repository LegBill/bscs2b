import java.util.Scanner;
public class Activity3_Legaspi{
    public static void main(String args[])
    {
        Scanner degrees = new Scanner(System.in);
        System.out.println("Enter your number in degrees: ");
        double Celsius = degrees.nextInt();
        double Fahrenheit = Celsius * 9/5 + 32;
        System.out. println("Your temperatur in Fahrenheit is "+Fahrenheit);
    }
    
}