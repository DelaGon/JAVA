import java.util.Scanner;
class AreaDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = circleAreaDifference(sc.nextDouble(), sc.nextDouble());

        System.out.println(String.format("%.3f", Math.abs(result)));

    }

    public static double circleAreaDifference(double radius1,double  radius2) {
        radius1 = (Math.PI*radius1*radius1);
        radius2 = (Math.PI*radius2*radius2);
        double result =radius2-radius1;
        
        return result;
    }
}