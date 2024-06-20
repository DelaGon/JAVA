import java.util.Scanner;
class properCase{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = properCase(sc.nextLine());
        System.out.println(result);
    }

    static String properCase(String ai){
    String a = (ai.toLowerCase());
    String b = a.indexOf(1);
    String result = (b.toUpperCase());
   return result;
    }

}
