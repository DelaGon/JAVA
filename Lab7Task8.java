import java.util.Scanner;
class Lab7Task8{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    double f =sc.nextDouble();
    double i =sc.nextDouble();
    double a = ft2cm(f,i);
    System.out.print("ft2cm"+"("+(int)f+","+(int)i+")"+" = ");
    System.out.print(String.format("%.1f",a)+"cm.");

}
public static double ft2cm(double ai,double bi){
  int ft = 12;
  double ii = 2.54;
  double b =bi*ii;
  double r =ai*ft*ii;
  double a =r+b;
  return a;
}

}