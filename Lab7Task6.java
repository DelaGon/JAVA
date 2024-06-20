import java.util.Scanner;
class Lab7Task6{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double weight =sc.nextDouble();
    double height =sc.nextDouble();
    double a=bmi(weight,height);
    System.out.println("weight(kg): "+weight);
    System.out.println("height(cm): "+height);
    System.out.print("BMI: ");
    System.out.print(String.format("%.2f",a));
}
    static double bmi(double ai,double bi){
    double b = bi/100;
    double a = ai/(b*b); 
    return a;

    }

}