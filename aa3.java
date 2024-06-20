import java.util.Scanner;
class aa3{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);	
		String x ="";
		while(true){
			x+=","+in.nextLine();
			if (x.contains("*")) {
				break;
			}
		}
		String [] pond = x.split(",");
		for (int i=0;i<pond.length-1 ;i++ ) {
			System.out.print(pond[i]+" ");
		}
		
	}
}