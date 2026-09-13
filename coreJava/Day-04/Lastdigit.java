import java.util.*;
class Lastdigit{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);	
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		int last=0;
		while(num!=0){
			 last=num%10;
			num=num/10;	
			break;
			}
				System.out.println("Last digit of this Number :  " +last);
		}

}