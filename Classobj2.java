package Basics;

import java.util.*;

class Example2{
	private int bcode;
	private String bname;
	private int innings,notout,runs;
	private  float batavg;
	/*public Example2(){
		this.batavg=this.runs/(this.innings-this.notout);
	} */
	private float calavg(){
		this.batavg=this.runs/(this.innings-this.notout);
		return batavg;	
	}
	public void readdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bcode: ");
		this.bcode=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter bname: ");
		this.bname=sc.nextLine();
		System.out.println("Enter innings: ");
		this.innings=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter not out: ");
		this.notout=sc.nextInt();
		sc.nextLine();System.out.println("Enter Runs: ");
		this.runs=sc.nextInt();
		sc.nextLine();
		//this.calavg();
	}
	public void displaydata() {
		System.out.println("bcode: "+this.bcode);
		System.out.println("bname: "+this.bname);
		System.out.println("innings: "+this.innings);
		System.out.println("Not out: "+this.notout);
		System.out.println("Runs: "+this.runs);
		System.out.println("Average: "+this.calavg());
	}
	
	
}

public class Classobj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 obj=new Example2();
		obj.readdata();
		obj.displaydata();

	}

}