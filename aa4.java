import java.util.Scanner;
class aa4{
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
		for (int i =pond.length-2;i>0 ;i-- ) {
			System.out.println(pond[i]);
		}
	}
}