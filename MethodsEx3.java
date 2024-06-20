import java.util.*;
public class MethodsEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert number: ");
        int x = sc.nextInt();
        int num = addTwo(x);
        System.out.println("The result#1 is " + num);
        num = addTwo(x + 5);
        System.out.println("The result#2 is " + num);
        num = addTwo(x * 3 + 2);
        System.out.println("The result#3 is " + num);
    }
    private static int addTwo(int a) {
        int result = a + 2;
        return result;
    }
} 
