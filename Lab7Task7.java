import java.util.Scanner;
class Lab7Task7{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    double kg =sc.nextDouble();
    double a = pound2kg(kg);
    System.out.print("pound2kg"+"("+(int)kg+")"+"=");
    System.out.print(String.format("%.2f",a));

	}
	public static double pound2kg(double ai){
    double pound = 0.453592;
    double a =ai*pound;
    return a;
	} 
}