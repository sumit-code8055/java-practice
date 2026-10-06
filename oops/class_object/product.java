class product{
 String name;
 double price;
 int quantity;
void showproduct_details(){
double total=price*quantity;
System.out.println("Product name : "+name);
System.out.println("Product price : "+price);
System.out.println("Product quantity: "+quantity);

System.out.println("Total Bill : "+total);

}
public static void main(String args[]){

product p1=new product();
p1.name="CPU";
p1.price=1200;
p1.quantity=5;

p1.showproduct_details();

}
}