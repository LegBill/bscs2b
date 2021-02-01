 import java.util.*;
public class MainClass {
    public static void main (String[] args)
    {
        Shape h1 = new Circle();
        Shape h2 = new Square();
        System.out.println("Welcome to Simple Abstraction! \n\n"
                + "\t Please type your number in order in diamater/length \n"
                + "\t in order to compute the areas in circle/square\n");
        
        System.out.print("\t Your number: ");
        Scanner skaner = new Scanner(System.in);
        double number = skaner.nextInt();
        System.out.print("\n\n\n");
        
        System.out.println("----------YOUR NUMBER AS A CIRCLE----------");
      
        h1.getArea(number);
        h1.getShapeUsage();
        h1.shapeSummary(number);
        h1.inGeneral();
        h1.shapeDrawing();
        System.out.print("\n\n");
        
        System.out.println("----------YOUR NUMBER AS A SQUARE----------");
        
        h2.getArea(number);
        h2.getShapeUsage();
        h2.shapeSummary(number);
        h2.inGeneral();
        h2.shapeDrawing();
        System.out.print("\n\n");
    }
}
