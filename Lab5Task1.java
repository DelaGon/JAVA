import java.util.Scanner;

class Lab5Task1{
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		Float num = Sc.nextFloat();
		System.out.print("Enter the second number:");
		Float num1 = Sc.nextFloat();

		if(num<num1){
			System.out.println("Result: ");
			System.out.println(+num);
			System.out.println(+num1);
		}else{
			System.out.println("Result: ");
			System.out.println(+num1);
			System.out.println(+num);
		}

		}
	}
