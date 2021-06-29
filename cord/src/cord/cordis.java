package cord;

import java.util.Scanner;

public class cordis {
static //public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	int n1=394376;
	st int n2=421875;
 int n3=390625;
	 int n4=781250;
	 int n5=484377;
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n value");
	int n=sc.nextInt();
	if(n1%5==0) {
	System.out.println("n1 is passed");	 
	}
	else
		System.out.println("n1 is failed");
	if(n2%5==0) {
		System.out.println("n2 is passed");
	}
	else
		System.out.println("n2 is failed");
	if(n3%5==0) {
		System.out.println("n3 is passed");
	}
	else
		System.out.println("n3 is failed");
	if(n4%5==0) {
		System.out.println("n4 is passed");
	}
	else
		System.out.println("n4 is failed");
	if(n5%5==0) {
		System.out.println("n5 is passed");
	}
	else {
		System.out.println("n5 is failed");
	}
}
}
