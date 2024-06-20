import java.util.Scanner;
class mini3{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String orders = sc.nextLine()+sc.nextLine()+sc.nextLine()+sc.nextLine()+sc.nextLine()+sc.nextLine()+sc.nextLine()+sc.nextLine()+sc.nextLine()+sc.nextLine();
            int sum =0;
            int o =0;
           for (int i=0 ; i<orders.length() ; i++){
            switch(o){
                case 0: if (orders.charAt(i) == 'e') sum+=25; 
                case 1: if (orders.charAt(i) == 'a') sum+=10; 
                  }  
                }
               
                System.out.println(sum+" minutes");
           }
    }    


