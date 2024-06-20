import java.util.Scanner;
class aa8{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	String[] input =in.nextLine().split(" ");
	int[] leon =new int[input.length];
	for (int i=0;i<input.length ;i++ ) {
		leon[i] =Integer.parseInt(input[i]);
	}
	for (int i=1;i<=20;i++ ) {
		boolean control =true;
		for(int j =0;j<leon.length;j++){
			if (leon[j]==i) {
				control =false;
			}
		}
		if (control==true) {
			System.out.print(i+" ");
		}
			
		
		
	}
}
}