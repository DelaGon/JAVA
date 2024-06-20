public class Part3Question4 {
    public static void main(String[] args) {
        int x =4;
        int y =6;
        System.out.println(myMethod(x,y));
        System.out.println(y);
    }
    private static int myMethod(int a,int x){
    int y =20;
    return y - a - x;
}
}