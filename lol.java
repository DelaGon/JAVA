import java.util.Scanner;
class lol{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     String one = sc.nextLine();
     String two = sc.nextLine();
     String three = sc.nextLine();
     float a,b,c;
      a = one.length();
      b =two.length();
      c =three.length();
      float total = a+b+c;
      float sum = total/3;
    System.out.println(String.format("%.2f",sum));
    

}
}
