class Student2 {

    int rollNo;
    String name;
    int marks;

    Student2(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

class StudentTest {

    public static void main(String[] args) {

        Student2 s1 = new Student2(101, "Rahul", 78);
        Student2 s2 = new Student2(102, "Amit", 92);
        Student2 s3 = new Student2(103, "Sumit", 85);
        Student2 s4 = new Student2(104, "Rohit", 95);
        Student2 s5 = new Student2(105, "Vikas", 88);

        Student2[] students = {s1, s2, s3, s4, s5};

        Student2 highest = students[0];

        for (int i = 1; i < students.length; i++) {

            if (students[i].marks > highest.marks) {
                highest = students[i];
            }
        }

        System.out.println("Student Having Highest Marks:");
        highest.display();
    }
}