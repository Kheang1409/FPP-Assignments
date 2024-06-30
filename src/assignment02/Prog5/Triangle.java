package Prog5;

final public class Triangle {
   private final double height;
   private final double base;

   public Triangle (double height, double base) {
      this.height = height;
      this.base = base;
   }

   public double getHeight() {
      return height;
   }

   public double getBase() {
      return base;
   }

   public double computeArea() {
      //Area of a triangle = 1/2 * base * height
      return 0.5 * height * base;
   }
}
