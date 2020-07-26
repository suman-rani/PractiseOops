package Basics;

import java.util.*; 

class Example3{
	private int testcode;
	private String description;
	private int nocandidate;
	private int centerreqd;
	private float calcenter() {
		this.centerreqd=this.nocandidate/100+1;
		return centerreqd;
	}
	public void schedule() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter test code: ");
		this.testcode=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the description: ");
		this.description=sc.nextLine();
		System.out.println("Enter the no of candidates: ");
		this.nocandidate=sc.nextInt();
		sc.nextLine();
	}
	public void displaytest() {
		System.out.println("Test Code:"+this.testcode);
		System.out.println("Description:"+this.description);
		System.out.println("No of Candidate:"+this.nocandidate);
		System.out.println("The no of centers are:"+this.calcenter());
	}
}

public class Classobj3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 obj=new Example3();
		obj.schedule();
		obj.displaytest();

	}

}