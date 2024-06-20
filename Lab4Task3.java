import java.util.Scanner;
class Lab4Task3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a frist number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter a secomd number: ");
    	int num2 = sc.nextInt();
    	int plus =num1+num2;
		
		if (plus>=50){
            System.out.println(num1+"+"+num2 +"="+plus+" --> pass.");
		}else{
			System.out.println(num1+"+"+num2 +"="+plus+" --> fail.");
		}
	}
	
}