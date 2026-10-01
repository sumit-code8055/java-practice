import java.util.*;
class MethodTest6{
public static void Square(int n){
	System.out.println("Square of "+n+" = "+n*n);
}
public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter the number : ");
	int n=sc.nextInt();
	Square(n);

}

}