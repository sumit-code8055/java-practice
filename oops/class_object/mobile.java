class mobile{
	String brand;
	String model;
	double price;

		void ShowMobileDetails(){
			System.out.println("Mobile Nmae : "+brand+" "+model);
			System.out.println("Price : "+price);
}
	public static void main(String args[]){
		mobile mb=new mobile();
			mb.brand="Samsung";
			mb.model="Galaxy";
			mb.price=100000;


				mb.ShowMobileDetails();	
			}

}