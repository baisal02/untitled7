public class Circle {
    private static double radius;
    private static final double PI=Math.PI;

    public Circle(int radius) {
        Circle.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public static double area() {
       return PI*Math.pow(radius,2);
    }
    public static double circumference(){
        return PI*2*radius;
    }
}
