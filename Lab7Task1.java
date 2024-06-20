import java.util.Scanner;
class Lab7Task1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Max = "+max(a,b));
	}
public static int max(int a,int b){
	if(a>b){
		return a;
	}else
	    return b;
}
	

}