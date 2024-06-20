import java.util.Scanner;
class Lab5Task3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
       
	 
      System.out.print("Enter your deposit money: ");
     double money =sc.nextDouble();
      
     
      System.out.println("Enter your accout type[a,b,c,d]: ");
      String accouttype = sc.next();

     switch(accouttype){
        case "a","A" :
        double aa = money+(money*(1.5/100));
        System.out.println("Net Deposit Money ="+aa);
     break;
        case "b","B" :
        double bb = money+(money*(2.0/100));
      	System.out.println("Net Deposit Money ="+bb);
     break;
        case "c","C" :
        double cc =money+(money*(3.5/100));
      	System.out.println("Net Deposit Money ="+cc);
     break;
        case "d","D" :
        double dd =money+(money*(5/100));
      	System.out.println("Net Deposit Money ="+dd);
      break;
        
        default : System.out.println("No such account!");
     
        
      	
      }


}

}