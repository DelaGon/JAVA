import java.util.Scanner;
class coco{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String name1 = sc.nextLine();
    String name2 = sc.nextLine();
  
   if(name1. equals(name2)){
   	System.out.println("exact match");              
   } else if (name1.compareToIgnoreCase(name2)==0) {
   	System.out.println("similar");
   }else{
    System.out.println("not the same");
  } 	
   
}

}
