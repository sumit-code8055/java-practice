import java.util.*;

class Grade {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Marks: ");
                  int marks= sc.nextInt();
	
		if(marks>=33){

			 if(marks>=40){
				if(marks>=52){
					if(marks>=60){
					System.out.print("pass 'A' grade");

							}
					else{
						System.out.print("pass 'B' grade");
							}

						}
				else{
				System.out.print("pass 'c' grade");	
						}

					}
			else{
				System.out.print("pass 'D' grade");
					}
			}
		else{
			System.out.print("Fail Try Again: ");	
				}
}
	}