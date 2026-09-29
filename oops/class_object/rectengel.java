class rectengel{
	float length;
	float width;
	void area(){
	System.out.println("Area : "+length*width);
	}
	void parmeter(){
	System.out.println("Parameter : "+2*(length+width));

		}
public static void main(String args[]){

rectengel rec= new rectengel();
rec.length=20;
rec.width=30;
rec.area();
rec.parmeter();

}

}