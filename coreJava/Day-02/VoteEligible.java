import java.util.*;

class VoteEligible {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Are you Indian? yes='y' no='n': ");
        String ind = sc.next();

        if (ind.equals("y")) {

            System.out.print("Enter your Age: ");
            int age = sc.nextInt();

            if (age >= 18) {

                System.out.print("Have you Voter ID or Aadhar Card? yes='y' no='n': ");
                String id = sc.next();

                if (id.equals("y")) {
                    System.out.println("Congratulations! You are eligible to vote.");
                } 
                else {
                    System.out.println("You are not eligible to vote because you don't have any ID.");
                }

            } 
            else {
                System.out.println("You are not eligible to vote because you are under age.");
            }

        } 
        else {
            System.out.println("You are not eligible to vote because you are not Indian.");
        }

        sc.close();
    }
}