class employe{
	int id;
	String name;
    
    double selary;
void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + selary);
        System.out.println("-------------------");
    }


public static void main(String args[]){
	employe emp=new employe();
	emp.id=1001;
	emp.name="Pranshoo";
	emp.selary=30750;
emp.displayDetails();
}
}