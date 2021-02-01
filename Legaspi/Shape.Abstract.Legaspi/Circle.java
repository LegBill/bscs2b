
public class Circle extends Shape {

    double results;
    
    
    @Override
    public void getArea(double i) {
        double d= 0.25;
        double pi= 3.14;
        this.results=d*pi*i*i;
        System.out.println("The area of circle is "+results);
    }

    @Override
    public void getShapeUsage() {
      System.out.println("Circles are useful because it paved the way for the concept "
              + "of wheels which provides us the convenience in logistics");
    }

    

    @Override
    public void shapeSummary (double b){
        System.out.println("You typed "+b+" and we utilized it as a diameter in order to attain the area, which is "+results);
    }

    @Override
    public void shapeDrawing() {
    System.out.println("     *****");
    System.out.println("   *       *");
    System.out.println("  *         *");
    System.out.println("   *       *");
    System.out.println("     *****");
    }
    
}
