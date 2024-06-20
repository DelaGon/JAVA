import java.util.Scanner;
class Lab8Task5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("How many Students?: ");
    int x = sc.nextInt();
    System.out.println("*Let input Student's name and score*");
    String[] k = new String[x];
    double[] o = new double[x];

    for ( int i=0 ; i<x ; i++ ) {
      System.out.println("Student No."+(i+1));
      System.out.print("Name: ");
      k[i] = sc.next();
    
      System.out.print("Score: ");
      o[i] = sc.nextDouble();
      System.out.println();
    }
    System.out.print("Enter PassScore: ");
    double num = sc.nextDouble();
    System.out.println();
    
    System.out.println("The Following Student Passed Exams!");
    
    for ( int i=0 ; i<k.length ; i++ ) {
      
      if(o[i]>=num){
      
      System.out.println(k[i]+"["+o[i]+"]");
      }
    }
  }
}