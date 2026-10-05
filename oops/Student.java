class Student {
    String sname;
    int srno;
    int hindi;
    int english;
    int math;

    void ShowStudentResult() {

        int total = hindi + english + math;
        float percent = total / 3.0f;

        System.out.println("Personal Details : ");
        System.out.println("RollNo. : " + srno);
        System.out.println("Name : " + sname);

        System.out.println("---------------------------------------------------------------");

        System.out.println("Marks : ");
        System.out.println("Hindi : " + hindi);
        System.out.println("English : " + english);
        System.out.println("Math : " + math);

        System.out.println("---------------------------------------------------------------");

        System.out.println("Grade:");
        System.out.println("Total No. : " + total);
        System.out.println("Percentage : " + percent + "%");
    }

    public static void main(String args[]) {

        Student s1 = new Student();

        s1.sname = "Sumit Tiwari";
        s1.srno = 101;
        s1.hindi = 70;
        s1.english = 65;
        s1.math = 86;

        s1.ShowStudentResult();
    }
}