import java.util.Scanner;

class Q13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		int n3 =sc.nextInt();
		
		if (n1> n2 && n1 >n3)
		{
			System.out.println(n1+" is greatest");
			
		}
		else if (n2 >n3)
		{
			System.out.println(n2+" is greatest");
			
		}
		else
		{
			
			System.out.println(n3+" is greatest");
		}
	}
}

class Q13Ternary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		int n3 =sc.nextInt();
		
		int n=n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
		
		System.out.println("greatest no is :"+n);
	}
}	
	
