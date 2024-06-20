import java.util.Scanner;
class Lab3Task6{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("set price for Coffee[Bath/cup]:");
    double coffee = sc.nextDouble();
    System.out.print("set price for Tea[Bath/cup]:");
    double tea = sc.nextDouble();
    System.out.print("set price for Milk[Bath/cup]:");
    double milk = sc.nextDouble();

    System.out.print("How many cups of Coffee?:");
    int price1 = sc.nextInt();

    System.out.print("How many cups of Tea?:");
    int price2= sc.nextInt();

    System.out.print("How many cups of Milk?:");
    int price3 = sc.nextInt();

    System.out.println("Coffee"+ price1 +"cups ="+coffee*price1+" Bath");
    System.out.println("Tea"+ price2 +"cups ="+tea*price2+" Bath");
    System.out.println("Milk"+ price3 +"cups ="+milk*price3+" Bath");

    System.out.println("Total price is "+(coffee*price1+tea*price2+milk*price3)+" Bath");



	}
}