import java.util.Scanner;
class codee1{
   public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double sum =0;
int x = sc.nextInt();
do {
   for (int i = 1; i <=x; i++) 
   sum +=sc.nextInt();

} 
 while (x != -1);
System.out.println(String.format("%.1f" sum/x));
}

}