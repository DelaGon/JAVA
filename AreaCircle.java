import java.util.Scanner;
class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result1 = circleArea(sc.nextDouble());
        double result2 = circleArea(sc.nextDouble());
        System.out.println(String.format("%.1f %.1f", result1, result2));
    }

    public static double circleArea(double radius) {
         radius = (Math.PI*Math.pow(radius,2));
         return radius;
    }

}