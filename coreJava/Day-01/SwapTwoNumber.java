import java.util.*;
class SwapTwoNumber{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	System.out.print("Enter the 1st number:");
	   int a=sc.nextInt();
	System.out.print("Enter the 2nd number:");
	   int b=sc.nextInt();
           System.out.println("After Swap :"+"a:"+a+" "+"b:"+b);
		a=b;
		int t=a;
		b=t;
   		System.out.println("Before Swap :"+"a:"+a+" "+"b:"+b);
		}
}