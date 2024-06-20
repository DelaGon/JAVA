import java.util.Scanner;
class lab4Task4{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
	int num = sc.nextInt();
    
    
    if (num<0){
   
          System.out.print(num+" is Negative Number.");
	 }
     
     if (num>0) {
     	System.out.print(num+" is Positive Number.");
     }
     
     if (num == 0){
     	System.out.print(num+" is zero");
     }
  }
	
}

	
