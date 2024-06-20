import java.util.Scanner;
class Lab8Task3{
	public static void main(String[]args){
	int i ;
	Scanner x =new Scanner(System.in);
	System.out.print("How many texts?: ");
	int k =x.nextInt();
	String h[] = new String[k]; 
	
	for(i=0;i<=k-1;i++){
	 h[i] = x.next();
	
	    
}
System.out.println("***Results***");
    for(i=k-1;i>=0;i--)
     {
     	System.out.println(h[i]);
   	
}
   }

}