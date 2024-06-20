import java.util.*;

public class MethodsEx4 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please insert number1: ");
    int x = sc.nextInt();
    System.out.println("Please insert number2: ");
    int y = sc.nextInt();

    int result = addTwo(x);
    System.out.println("The result#1 is " + result);
    result = addNum(x + 5, y);
    System.out.println("The result#2 is " + result);
    result = addTwo(x * 3 + 2);
    System.out.println("The result#3 is " + result);
}

private static int addTwo(int a) {
    return addNum(a, 2);
}

private static int addNum(int a, int num) {
    return a + num;
}
} 
