import java.util.Scanner;
class cd102 {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     int a = sc.nextInt();
     int matrix [][]= new int[a][t];
     for (int i =0;i<matrix.length;i++ ) {
       for(int j =0;j<matrix[0].length;j++){
        matrix[i][j] =sc.nextInt();
      }
     }
     System.out.print(ist(matrix));
    }
    public static boolean ist(int[][] a)
    {
      int sum =0;
      boolean is =false;
      for (int i =0;i<a.length ;i++ ) {
        int v =0;
       for(int j =0;j<a[0].length;j++){
          v +=a[i][j];
       }
       if (i==0)
        sum = v; 
        if (sum==v) {
          is = true;
        }else{
          is = false;
          break;
  }
        }
        return is;
  }
}

         
  