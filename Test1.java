import java.util.Scanner;
class Test1{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            int n =0;
            try {
            while (true){
            int k = sc.nextInt();
          if (isPrime4(k)==true){
            n++;
        }
            
        }
            }catch(java.util.NoSuchElementException e){
            }
            System.out.println("isPrime4 = "+n);
        }
        static boolean isPrime4(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}