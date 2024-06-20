import java.util.Scanner;
class Lab7Task10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = countPrime(a,b);
        System.out.println("Between "+a+" and "+b+" has "+count+" prime number.");
    }
       static int countPrime(int ai,int bi){
        int count = 0;
        if(ai>bi){
        for(int i=ai+2;i>=bi;i--){
            if(i%2==0 && i%3!=0 && i%5!=0 && i%7!=0){
           count+=1;
        }else if(i%2!=0 && i%3==0 && i%5!=0 && i%7!=0){
            count+=1;
        }else if(i%2!=0 && i%3!=0 && i%5==0 && i%7!=0){
            count+=1;
        }else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7==0){
            count+=1;
        }
        }
           return count;
        }  else  {
           
        for(int i=ai-1;i<=bi;i++){
            if(i%2==0 && i%3!=0 && i%5!=0 && i%7!=0){
            count+=1;
        }else if(i%2!=0 && i%3==0 && i%5!=0 && i%7!=0){
            count+=1;
        }else if(i%2!=0 && i%3!=0 && i%5==0 && i%7!=0){
            count+=1;
        }else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7==0){
            count+=1;
        }
        }  
        }
           return count;
        }
       
       

}