public class Square extends Shape{
 double results;
    @Override
    public void getArea(double i) {
      this.results=i*i;
    }

    @Override
    public void getShapeUsage() {
       System.out.println("Squares are useful because it is among of the symmetrical shapes utilized "
              + "in order to determine right angles, and other proportional measurements");
    }

    @Override
    public void shapeSummary(double b) {
        System.out.println("You typed "+b+" and we utilized it as a side length and then square it, in order to attain the square's area, which is "+results);
    }

    @Override
    public void shapeDrawing() {
         System.out.println("----------------");
         System.out.println("|              |");
         System.out.println("|              |");
         System.out.println("|              |");
         System.out.println("|              |");
         System.out.println("|              |");
         System.out.println("|              |");
         System.out.println("----------------");
         
    }
    
    
}
