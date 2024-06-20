import java.util.Scanner;
class Lab7Task3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int n = sc.nextInt();
		echo(text,n);
		
} 
public static void echo(String text,int n){
   
   for (int i = 1;i<=n ;i++ ){
   	System.out.println(text);
   	

}
  

}
}