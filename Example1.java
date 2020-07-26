package Basics;

import java.util.Scanner;
class Classobj1{
	private int admno;
	private  String sname;
	private float m1;
	private float m2;
	private float total;
	private float ctotal() {
		this.total=total;
		this.m1=m1;
		this.m2=m2;
		this.total=this.m1+this.m2;
		return total;
	}
	public void takedata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student admission number:");
		this.admno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student name:");
		this.sname=sc.nextLine();
		System.out.println("Enter Marks 1");
		this.m1=sc.nextFloat();
		System.out.println("Enter Marks 2");
		this.m2=sc.nextFloat();
		this.ctotal();	
	}
	public void showdata() {
		System.out.println("Student Admission number : "+this.admno);
		System.out.println(" Student Name : "+this.sname);
		System.out.println(" Student Marks 1 : "+this.m1);
		System.out.println(" Student Marks 2 : "+this.m2);
		System.out.println("Student total Marks : "+this.ctotal());
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classobj1 obj=new Classobj1();
		obj.takedata();
		obj.showdata();

	}

}