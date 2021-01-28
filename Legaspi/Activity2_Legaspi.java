import java.util.Scanner;
public class Activity2_Legaspi{
    public static void main(String args[])
    {
        Scanner memong = new Scanner(System.in);
        System.out.println("Enter your 1st number: ");
        int n1=memong.nextInt();
        System.out.println("Enter your 2nd number: ");
        int n2=memong.nextInt();
        System.out.println("Enter What You Want to do with these numbers: ");
        System.out.println("[1] ADD \n [2] SUBTRACT \n [3] MULTIPLY \n [4] DIVIDE");
        int choices= memong.nextInt();
        
        switch(choices)
        {
            case 1:
                System.out.println("The Sum of "+n1+" and "+n2+" is "+(n1+n2));
                break;
            case 2:
                System.out.println("The Difference of "+n1+" and "+n2+" is "+(n1-n2));
                break;
            case 3:
                System.out.println("The Product of "+n1+" and "+n2+" is "+(n1*n2));
                break;
            case 4:
                System.out.println("The quotient of "+n1+" and "+n2+" is "+(n1/n2)+"."+(n1%n2));
                break;
                
        }
        
        
    }
    
}