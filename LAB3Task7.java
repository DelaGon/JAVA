import java.util.Scanner;
class Lab3Task7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Name :");
     String name = sc.nextLine();
		System.out.print("Enter Your Height(cm.) :");
	 int height = sc.nextInt();
		System.out.print("Enter Your Weight(Kg.) :");
     int weight = sc.nextInt();

    System.out.print(name+" Your BMI ="+weight/(height*0.01));
	}
}