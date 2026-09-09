import java.util.*;
class LargestThreeNumber{
public static void main(String args[]){
    	  Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st number :");
		int a=sc.nextInt();
		System.out.print("Enter the 2nd number :");
		int b=sc.nextInt();
		System.out.print("Enter the 3rd number :");
		int c=sc.nextInt();

		if(a>b &&a>c){
			System.out.print(a+" : is largest number");
				}
                else if(b>c &&b>a){
			System.out.print(b+" : is largest number");
				}

		else{
			System.out.print(c+" : is largest number");
				}
		}	

}