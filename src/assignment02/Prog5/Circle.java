package Prog5;

//Area of a circle = PI * radius * radius
final public class Circle {
    private final double pi = Math.PI;
    private final double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double computeArea(){
        return pi * radius * radius;

    }
}




