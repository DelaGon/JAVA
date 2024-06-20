import java.util.Scanner;
class Lab4Task1{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int abolute = num*-1;
    if(num<0)    
    System.out.print("absolute of"+num+"="+abolute);
	
  }
}