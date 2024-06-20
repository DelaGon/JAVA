import java.util.Scanner;
class Lab7Task2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum = "+sum(a,b)); 
		System.out.println("Average = "+avg(a,b));
	}
	public static int sum(int a,int b){
		int sum =(a+b);
		return sum;
		
	}
    public static double avg(double a,double b){
		double avg =(a+b)/2;
		return avg;
		
}
}