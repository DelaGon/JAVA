import java.util.Scanner;
class Lab8Task2{
public static void main(String[]args){
  Scanner x =new Scanner(System.in);
  
  System.out.print("How many number :");
  int k = x.nextInt();
  int i;
  int num[] = new int[k];

for(i=0;i<=k-1;i++){
	num[i] =x.nextInt();

	}
System.out.println("Results :");
    for(i=k-1;i>=0;i--){
 System.out.println(num[i]+"*"+num[k-i-1]+" = "+num[i]*num[k-i-1]);
   }

}
}
