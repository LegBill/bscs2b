import java.util.*;
public class Activity6_Legaspiii {
    
    public static void main (String[] args)
    {
        int[] nums= new int [10];
        System.out.println("Please enter 10 numbers: ");
        Scanner skaner = new Scanner(System.in);
        for(int i=0;i<=9;i++)
        {
            int dugang = skaner.nextInt();
            nums[i]=dugang;
        }
        
        Arrays.sort(nums);
        System.out.print("The MINIMUM NUMBER is "+nums[0]+" while the MAXIMUM NUMBER is "+nums[9]+" \n");
        
        
        
    }
    
}
