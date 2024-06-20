class Lab9Task3{
	public static void main(String[] args){
	double data[] ={10,5,6,4,3};
		
		System.out.println("Sum = "+(int)sum(data));   // the result is 28
		System.out.println("Average = "+average(data)); //5.6
	}
       static double sum(double a[]){
       	int sum = 0;
       	for (int j =0;j<a.length;j++){
        
        sum+=a[j];
    
       	}
       	return sum;
  }
      static double average(double a[]){
      double aver=0;
      
     for (int i =0;i<a.length;i++){
      aver+=a[i];
      
  }
      double average = aver/a.length;
      return average;
}
}


