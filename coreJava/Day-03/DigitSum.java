import java.util.*;

class DigitSum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
		System.out.print("Enter  the number : ");
                  int num= sc.nextInt();
			int count=0;
			while(num!=0){
			int sum=num%10;
			num=num/10;
			count=count+sum;		
				}
		System.out.print(" Digit Sum : "+count);
}
	}