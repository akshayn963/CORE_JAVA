import java.util.Scanner;

class Q11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no1 : ");
		int a =sc.nextInt();
		System.out.println("Enter no2 : ");
		int b =sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("no 1 after swapping : "+a);
		System.out.println("no 2 after swapping : "+b);
	}
}