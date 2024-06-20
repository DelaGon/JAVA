import java.util.Scanner;
class Lab4Task2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		if (number>50){
            System.out.println(number+"pass.");
		}else{
			System.out.println(number+"fail.");
		}
	}
	
}