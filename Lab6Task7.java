import java.util.Scanner;
public class Lab6Task7
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
       for(int i =1;i<=a;i++){
        for (int j=a-i;j>0 ;j-- ) {
            System.out.print(" ");
        }
        for (int k =i;k>0 ;k-- ) {
            System.out.print(k);
        }for (int b =2;b<= i ;b++ ) {
            System.out.print(b);
        }
        System.out.println();
       }
       System.out.println();
   }
}
     
        

