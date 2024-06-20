class Lab9Task4{
	public static void main(String[] args){
	
	 int data[] ={10,55,96,144,23};
	 int maxNumber = max(data); 
	 System.out.println("Max Number = "+maxNumber);

	}
    static int max(int a[]){
    int maxNumber = a[0];
    for (int i=0;i<a.length ;i++ ) {
    	if(maxNumber<a[i])
    		maxNumber=a[i];
    }
   return maxNumber;
}
}