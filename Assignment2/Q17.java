import java.util.Scanner;
class Q17
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int n= sc.nextInt();
		int r=0;
		int a=0;
		while(n>0)
		{	
		 a= n%10;
	     r=r*10+a;
		 n=n/10;
	    }
		System.out.println("reverse num is : "+r);
	}
}
	    