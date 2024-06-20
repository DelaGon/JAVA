import java.util.Scanner;

class Lab8Task4{
	public static void main(String[]args){
   Scanner x = new Scanner(System.in);
   System.out.print("How many Students?: ");
   int k = x.nextInt();
    System.out.println("**Let input Student's name and score**");
   String h[] = new String[k]; 
   double mx=55.5;
   String sm="";
   
   	for (int i =0;i<k;i++ ){
   	System.out.println("Student No.1"+(i));
   	
   	System.out.print("Name: ");
   	String a =x.next();
   	
    h[i]=a;
   	System.out.print("Score: ");
   	double b= x.nextDouble();
       
      if(b>=mx){
        mx=b;
        sm =h[i];

      }
      }
      
      System.out.println("The Following Students Passed Exams! "+sm);
   
    }

}