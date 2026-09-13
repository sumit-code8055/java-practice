import java.util.*;

class Palindrom {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
		System.out.print("Enter  the number : ");
                  int num= sc.nextInt();
		int temp=num;
		int rev=0;
		while(num!=0){
		 int digit = num % 10;
           	 rev = rev * 10 + digit;
		num=num/10;
}
if(rev==temp){
		System.out.print("Palindrom");

}
else{
		System.out.print(" not Palindrom");
}
}
}
