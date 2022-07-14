
package workspace;
import java.util.Scanner;
public class EvenOdd {
public static void main(String[] args) {    
// n is odd = 3*n+1
// n is even = n/2   
Scanner reader = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = reader.nextInt();
if(num % 2 == 0)
System.out.println(num + " is even");
else
System.out.println(num + " is odd");
int n=3132;
int counter;
System.out.println(n);
counter=0;
while(n>1) {
if(n%2==0) n/=2; // even
else n=3*n+1; // odd;
counter++;
System.out.println(" Current given value is: "+n);
}
}
}
