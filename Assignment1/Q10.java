import java.util.Scanner;

class Q10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temp :");
		float f=sc.nextInt();
		float c =5*(f-32)/9;
		
	    System.out.println("new temp is: "+c);
	}
}