import java.util.Scanner;
class Lab9Task2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		
		int data[] ={10,5,6,4,3};
		
		System.out.println("Sum = "+sum(data));   // the result is 28
		System.out.println("Average = "+average(data)); //5.6
	}
       static int sum(int a[]){
       	int sum = 0;
       	for (int j =0;j<a.length;j++){
        
        sum+=a[j];
    
       	}
       	return sum;
  }
      static int average(int a[]){
      double aver=0;
      
     for (int i =0;i<a.length;i++){
      aver+=a[i];
      
  }
      double average = aver/a.length;
      return average;
}
}


