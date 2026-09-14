import java.util.*;
class Sum_Array{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Array Size:");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the  "+ n +" Array Element:");
			for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
				}
			int sum=0;
			for(int i=0;i<arr.length;i++){
			sum=arr[i]+sum;	

			}
			System.out.println("Sum of Array :"+sum);
}
		}