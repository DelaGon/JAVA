import java.util.Scanner;
class Lab5Task2{
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int money = 100000;
		int money1 = 50000-100000;
		int money3 = 50000;
		
		System.out.print("Enter your income: ");
		Float num = Sc.nextFloat();

		if(num<money3){
			System.out.println("Tax = "+(num/100)*5);
		}else if (num>money) {
			System.out.println("Tax = "+(num/100)*15);
		}else{ 
			System.out.println("Tax = "+(num/100)*10);

		}
	}
}