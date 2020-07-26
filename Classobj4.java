package Basics;

import java.util.*;

class Example4{
	private int flightno;
	private String destination;
	private float distance;
	private float fuel;
	private float calfuel() {
		if(this.distance<=1000)
			return this.fuel=500;
		else if(this.distance>1000 && this.distance<=2000) {
			return this.fuel=1100;
		}
		else 
			return this.fuel=2200;
	}
	public void feedinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the flight no:");
		this.flightno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the destination:");
		this.destination=sc.nextLine();
		System.out.println("Enter the distance:");
		this.distance=sc.nextFloat();
		this.calfuel();
	}
	public void showinfo() {
		System.out.println("Flight no is: "+this.flightno);
		System.out.println("Destination is: "+this.destination);
		System.out.println("Distance is: "+this.distance);
		System.out.println("Fuel is: "+this.calfuel());
	}
}

public class Classobj4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example4 obj=new Example4();
		obj.feedinfo();
		obj.showinfo();

	}

}