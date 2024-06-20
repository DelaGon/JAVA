import java.util.Scanner;
class Lab5Task4{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Number of buf : ");
 int bufall = sc.nextInt();
 int fristson = bufall/3;
 int fraction = bufall%3;
 int secondtson = bufall/3;
 int thirdson = bufall/3;
 int a =fristson+1;
 int b =secondtson+1;
 int c =thirdson+1;

 if(fraction>=2){
 System.out.println(fristson+","+b+","+c);
 } else if (fraction==1) {


 System.out.println(a+","+secondtson+","+thirdson);

 }else {

 System.out.println(fristson+","+secondtson+","+thirdson);
 }
 }
 }