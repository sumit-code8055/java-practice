class student {
int id;
String name;

    static String college = "AKTU";

    student(int id, String name) {

       this.id=id;
	this.name=name; 
    }

    void display() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(college);
    }

    public static void main(String[] args) {

        student s1 = new student(101, "Sumit");
        student s2 = new student(102, "Rahul");

        s1.display();
        s2.display();
    }
}