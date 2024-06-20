import java.util.Scanner;
class Lab7Task4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int len =0;
        len = str.length();
        line('#',len+2);
		textBox(str,'#');

	}
	static	void line(char c,int n){
		for(int i=0;i<n;i++){
			System.out.print(c);
		}
		System.out.println();
	}

	static void textBox (String c,char n){
		
		int len = c.length();
        int a = len+2;
            
			System.out.print(n);
			System.out.print(c);
			System.out.println(n);
			line(n,a);
			}
	
}
