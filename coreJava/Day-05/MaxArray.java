import java.util.*;
class MaxArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Array Size:");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the  "+ n +" Array Element:");
			for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
				}
			int max=arr[0];
			for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
			max=arr[i];	
				}
			}
			System.out.println("Maximum  element of Array :"+max);
}
		}