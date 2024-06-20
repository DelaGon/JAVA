//import java.util.Scanner;
class Fam{
       public static void test(int inputArray[])
       {
int counter = 0; 
for (int i = 0; i < inputArray.length; i++)
{
if(inputArray[i] != 0) {
inputArray[counter] = inputArray[i]; 
counter++;
}
}
while (counter < inputArray.length) {
inputArray[counter] = 0; 
counter++;
}
for(int i = 0; i < inputArray.length; i++) {
System.out.print(inputArray[i]+",");
}
System.out.println();
}
public static void main(String[] args)
{

int[] A = {12, 0, 7, 0, 8, 0, 3}; 
int[] B = {1, -5, 0, 0, 8, 9, 1}; 
int[] C = {0, 0, 0, 0, 0, 0, 1}; 
int[] D = {1, 1, 1, 1, 1, 1, 1}; 
test(A); 
test(B);
test(C); 
test(D);
}
}


    