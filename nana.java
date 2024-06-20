import java.util.Scanner;
import java.util.Arrays;
class Test3{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int b =sc.nextInt();
    int c =sc.nextInt();
    int[] a1 = new int[]{a,b,c};
Arrays.sort(a1);
for(int i : a1){
	System.out.println(i+" ");
}
}
}