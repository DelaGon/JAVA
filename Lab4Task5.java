import java.util.Scanner;
class Lab4Task5
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
      System.out.print("Enter a pass code:");
       String character = sc.nextLine();
       if (character.length()>=10) {
        System.out.print("Your pass code is too long. ");
           
       }else if (character.length()<=4) {
        System.out.print("Your pass code is too short. ");
       }else
        System.out.print("Your pass code is too accepted ");
       } 
 }
       

	
   

























