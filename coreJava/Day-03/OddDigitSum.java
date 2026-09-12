import java.util.*;

class OddDigitSum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
		System.out.print("Enter  the number : ");
                  int num= sc.nextInt();
		int sum=0;
		while(num!=0){
		int last=num%10;
		if(last%2!=0){
		 sum=last+sum;	
			
			}
		num=num/10;
		}
	System.out.println(sum);
}

}