class CarSell{
	String brand;
    	String model;
    	double price;
CarSell(String brand,String model,double price){
this.brand=brand;
this.model=model;
this.price=price;
}
void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);

}

}

class CarPrice{
    public static void main(String[] args) {

CarSell c1=new CarSell("XUV","XUV100",2200000);
CarSell c2=new CarSell("Mahendra","Thar",2500000);
CarSell c3=new CarSell("TATA","Alto",250000);
CarSell c4=new CarSell("TATA","Punch",600000);
CarSell c5=new CarSell("KIA","KIA125",900000);

        CarSell[] sells = {c1, c2, c3, c4, c5};
       
	CarSell highest=sells[0];

for (int i = 1; i < sells.length; i++) {

            if (sells[i].price > highest.price) {
                highest = sells[i];
            }
        }
System.out.println("Car Having Highest price:");
        highest.display();



}

}
