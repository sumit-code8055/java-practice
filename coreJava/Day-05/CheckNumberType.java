import java.util.*;
class CheckNumberType{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Array Size:");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the  "+ n +" Array Element:");
			for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
				}
			int post=0;
			int neg=0;
			int zero=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]>0){
					post=post+1;
						}
				else if(arr[i]<0){
					neg=neg+1;
				}
				else{
				zero=zero+1;
				}

			}
			System.out.println("Positive number :"+post+" Negative Number : "+neg+" Zero : "+zero);
}
		}