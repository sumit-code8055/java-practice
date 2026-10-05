class employee {
    String ename;
    int eid;
    double basicsalary;
    double bouns;

    void ShowEmployeeData() {

        double totalsalary =basicsalary+bouns;
       

        System.out.println("Personal Details : ");
        System.out.println("Employee id. : " + eid);
        System.out.println(" Employee Name : " + ename);

        System.out.println("---------------------------------------------------------------");

        System.out.println("salary : ");
        System.out.println("Basic salary : " + basicsalary);
        System.out.println("Bouns : " + bouns);

        System.out.println("---------------------------------------------------------------");

        System.out.println("In Hand Salary:");
        System.out.println("Total selary : "+totalsalary);
    }

    public static void main(String args[]) {

       employee e1 = new employee();

        e1.ename = "Sumit Tiwari";
        e1.eid= 1001;
        e1.basicsalary=25000;
	e1.bouns=10000;
 	employee e2 = new employee();

        e2.ename = "Vinit Tiwari";
        e2.eid= 1002;
        e2.basicsalary=20000;
	e2.bouns=10000;


        e1.ShowEmployeeData();
        System.out.println("---------------------------------------------------------------");

        e2.ShowEmployeeData();
    }
}