import java.util.*;
class MinArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Array Size:");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the  "+ n +" Array Element:");
			for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
				}
			int min=arr[0];
			for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
			min=arr[i];	
				}
			}
			System.out.println("Minimum  element of Array :"+min);
}
		}