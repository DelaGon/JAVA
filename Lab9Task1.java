class Lab9Task1{
	public static void main(String[] args){
		int data[] ={10,5,6,4,3}; 
		System.out.println(sum(data));   // the result is 28
	}
       static int sum(int a[]){
       	int sum =0;
       	for (int i =0;i<a.length;i++ ) {
       		sum+=a[i];
       	}
       	return sum;
 
}


}