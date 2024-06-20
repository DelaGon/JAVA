import java.util.Scanner;
class Lab7Task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int lower = sc.nextInt();
		int upper = sc.nextInt();
		int a = ssum(lower,upper);
		int b = ssum(upper);
		
		System.out.println("Sum from "+lower+" to "+upper+" = "+a);
		System.out.println("Sum from 1 to "+upper+" = "+b);
	}
	
	static int ssum(int ai,int bi){ 
      int a =0;
      for (int i= ai;i<=bi ;i++ ) 
      a +=i;

     return a;
     
      }
    
    static  int ssum(int bi){
      int b =0;
      for (int i=1;i<=bi ;i++ )
      b +=i;

      return b;
     }

} 