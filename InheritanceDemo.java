/*

Java Program to demonstrate Inheritance concept
Author: Sreenivasulu G
Date: 30-08-2016

*/

class Person
{
	String name;
	String address;

	//Constructor
	Person(String name,String address)
	{
		this.name = name;
		this.address = address;
	}

	String getName()
	{
		return name;
	}

	String getAddress()
	{
		return address;
	}

	void setAddress(String address)
	{
		this.address = address;
	}
	
	public String toString()
	{
		return "Person[name=" + name + "," + "address=" + address + "]";
	}
}


class Student extends Person
{
	private String program;
	private int year;
	private double fee;

	//Constructor
	Student(String name,String address,String program,int year,double fee)
	{
		super(name,address);
		this.program = program;
		this.year = year;
		this.fee = fee;				

	}

	String getProgram()
	{
		return program;
	}
	void setProgram(String program)
	{
		this.program = program;
	}

	int getYear()
	{
		return year;
	}
	void setYear(int year)
	{
		this.year = year;
	}

	double getFee()
	{
		return fee;
	}
	void setFee(double fee)
	{
		this.fee = fee;
	}	
	
	public String toString()
	{
		return "Student[Person[name=" + name + "," + "address=" + address +"]" + "," +"program=" + program + "," + "year="+year+","+ "fee=" + fee + "]" ;
	}
}

class Staff extends Person
{
	String school;
	double pay;

	//Constructor
	Staff(String name,String address,String school,double pay)
	{
		super(name,address);
		this.school = school;
		this.pay = pay;				

	}

	String getSchool()
	{
		return school;
	}
	void setSchool(String School)
	{
		this.school = school;
	}

	double getPay()
	{
		return pay;
	}
	void setPay(double pay)
	{
		this.pay = pay;
	}

	
	public String toString()
	{
		return "Staff[Person[name=" + name + "," + "address=" + address +"]" + "," +"school=" + school + "," + "pay=" + pay + "]" ;
	}
}

public class InheritanceDemo
{
	public static void main(String args[])
	{

		//Student subclass
		Student p = new Student("Raj","Kadapa","B.Tech",2015,35000.00);

		System.out.println("Student data through constructor initialization:");

		String str = p.toString();	
		System.out.println(str);

		System.out.println();

		System.out.println("Student data through get and set methods:");
		
		String perName = p.getName();	
		System.out.println("Student Name="+perName);	

		p.setAddress("Hyderabad");	

		String perAddr = p.getAddress();	
		

		System.out.println("Student Address="+perAddr);

		p.setProgram("M.Tech");

		p.setYear(2014);
		
		p.setFee(50000.00);	

		String studProg = p.getProgram();
		
		System.out.println("Student Program="+studProg);

		double studYr = p.getYear();

		System.out.println("Student Year="+studYr);

		double studFee = p.getFee();

		System.out.println("Student Fee="+studFee);	

		
		String str1 = p.toString();	
		System.out.println(str1);	

		//Staff subclass
		Staff stf = new Staff("SREENU","Kadapa","VBIT",50000.00);

		System.out.println("Staff data through constructor initialization:");
		String staffstr = stf.toString();	
		System.out.println(staffstr);

		System.out.println();

		System.out.println("Staff data through get and set methods:");
		
		String stfName = stf.getName();

		System.out.println("Staff Name="+stfName);

		stf.setAddress("Chennai");	

		String stfAddr = stf.getAddress();
		System.out.println("Staff Address="+stfAddr);

		stf.setPay(60000.00);	
		
		stf.setSchool("VBIT");		

		String stfSchool = stf.getSchool();

		System.out.println("Staff School="+stfSchool);

		double stfPay = stf.getPay();
		System.out.println("Staff Pay="+stfPay);
		
		String stfStr1 = stf.toString();	
		System.out.println(stfStr1);
	}
}