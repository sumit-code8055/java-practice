class Bank{
String name;
String acountno;
double balance;
void showdetails(){
	System.out.println("Acount Number : "+acountno);
	System.out.println("Acount Holder Name : "+name);
	System.out.println("Balance : "+balance);

}

public static void main(String args[]){
Bank bah= new Bank();
bah.name="Sumit Tiwari";
bah.acountno="21654789";
bah.balance=30000;

bah.showdetails();

	}
}