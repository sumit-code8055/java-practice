class car{
	String brand;
    String model;
    double price;
void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }


public static void main(String args[]){
	car car1=new car();
	car1.brand="mahendra";
	car1.model="Thar";
	car1.price=2000000;
	car car2=new car();
	car2.brand="Toyota";
	car2.model="Fortuner";
	car2.price=3000000;


	car1.displayDetails();
	car2.displayDetails();

	}

}