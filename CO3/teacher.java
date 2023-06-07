import java.util.Scanner;
class employee{
	int empid;
	String name;
	double salary;
	String address;
	employee(int no,String na,double sal,String add){
		this.empid=no;
		this.name=na;
		this.salary=sal;
		this.address=add;
	}
}
public class teacher extends employee{
	String dept;
	String subject;
teacher(int no,String na,double sal,String add,String dep,String sub){
	super(no,na,sal,add);
	this.dept=dep;
	this.subject=sub;
}

void  display(){
	System.out.println("Employee id:"+empid);
	System.out.println("Name: "+name);
	System.out.println("Salary: "+salary);
	System.out.println("Address: "+address);
	System.out.println("Department: "+dept);
	System.out.println("Subject: "+subject);
}

public static void main(String[] args){
	System.out.println("Name: SHANU P J\nRegisterNo: SJC22MCA-2050\nCourse Code: 20MCA132\n Date: 05/06/2023");
	System.out.println("\nEnter the number of employee's: ");
	Scanner sc1=new Scanner(System.in);
	int num=sc1.nextInt();
	teacher arr[]=new teacher[num];
	for(int i=0;i<num;i++)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter employee id: ");
		int empid=sc.nextInt();
		System.out.println("\nEnter employee name: ");	
		String name=sc.next();
		System.out.println("\nEnter salary: ");
		double salary=sc.nextDouble();
		System.out.println("\nEnter address: ");
		String address=sc.next();
		System.out.println("\nEnter department: ");
		String dept=sc.next();
		System.out.println("\nEnter subject: ");
		String subject=sc.next();
		arr[i]=new teacher(empid,name,salary,address,dept,subject);
		
	}
	System.out.println("\n******Information of all the Employee's******");
	for(int i=0;i<num;i++){
		int j=i+1;
		System.out.println("\n"+j+").");
		arr[i].display();
		
	}
	sc1.close();
	}
	
}
