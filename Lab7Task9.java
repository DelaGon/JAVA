import java.util.Scanner;
class Lab7Task9{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double pound =sc.nextDouble();
    double f= sc.nextDouble();
    double inch = sc.nextDouble();
    double a=weight(pound);
    double b=height(f,inch);
    System.out.println(pound+"pounds"+" = "+a+" kg.");
    System.out.println((int)f+"f"+","+(int)inch+"inc."+" = "+b+"cm.");
    double k = b/100;
    System.out.printf("BMI = %.2f", a/(k*k));
}
static double weight(double ai){
	double pp =0.453592;
	double a=ai*pp;
	return a;

}
static double height(double ai,double bi){
	int ft =12;
	double inc =2.54;
	double b = (ai*ft*inc)+(bi*inc);
	return b;
}
}