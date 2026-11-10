class Student3{
int rollNo;
String name;
double marks;
public static void main(String args[]){
Student3 s1= new Student3();
s1.rollNo=100;
s1.name="Sumit";
s1.marks=85.5;
Student3 s2= new Student3();
s2.rollNo=101;
s2.name="Amit";
s2.marks=80.5;
Student3 s3= new Student3();
s3.rollNo=102;
s3.name="Rohan";
s3.marks=75.5;
Student3 s4= new Student3();
s4.rollNo=103;
s4.name="Rohit";
s4.marks=65.5;
Student3 s5= new Student3();
s5.rollNo=104;
s5.name="Amar";
s5.marks=90.5;
System.out.println("Roll No : "+s1.rollNo+" "+"Name : "+s1.name+" "+"Marks : "+s1.marks+"%");
System.out.println("---------------------------------------------------------------------------------------------");

System.out.println("Roll No : "+s2.rollNo+" "+"Name : "+s2.name+" "+"Marks : "+s2.marks+"%");
System.out.println("---------------------------------------------------------------------------------------------");

System.out.println("Roll No : "+s3.rollNo+" "+"Name : "+s3.name+" "+"Marks : "+s3.marks+"%");
System.out.println("---------------------------------------------------------------------------------------------");

System.out.println("Roll No : "+s4.rollNo+" "+"Name : "+s4.name+" "+"Marks : "+s4.marks+"%");
System.out.println("---------------------------------------------------------------------------------------------");

System.out.println("Roll No : "+s5.rollNo+" "+"Name : "+s5.name+" "+"Marks : "+s5.marks+"%");

}
}