import java.util.Scanner;
class Lab6Task8{
  public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
 
 int max=0;
 int min=0;
  for (int i=1;i<=10;i++){
    int num = sc.nextInt();
  if(i==1){
   min=num;
   max=num;
   }
   else if(num>max){
   max=num;
   }else if (num<min) {
   min=num; 
   }else{
    continue;
   }
   }

  
   System.out.println(min);
 }
}