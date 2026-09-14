import java.util.*;
class FindEvenNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Array Size:");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the  "+ n +" Array Element:");
			for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
				}
			int check=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]%2==0){
					check=check+1;
						}

			}
			System.out.println("Even Number of Array :"+check);
}
		}