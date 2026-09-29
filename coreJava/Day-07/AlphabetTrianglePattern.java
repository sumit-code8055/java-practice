
import java.util.Scanner;
class AlphabetTrianglePattern{
public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
		System.out.print("enter the number :");
		int row=sc.nextInt();

		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)(j+64)+" ");	

					}
				System.out.println();

				}
		}
}