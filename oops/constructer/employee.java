class employee{
int salary;
String name;

    static String company = "TATA GROUP";

    employee(int salary, String name) {

       this.salary=salary;
	this.name=name; 
    }

    void display() {

        System.out.println(salary);
        System.out.println(name);
        System.out.println(company);
    }

    public static void main(String[] args) {

        employee e1 = new employee(35000, "Sumit");
      employee e2 = new employee(30000, "Rahul");

        e1.display();
        e2.display();
    }
}