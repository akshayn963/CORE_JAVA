import java.util.Scanner;
class Q19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int n= sc.nextInt();
		
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			sum +=(i*i);
		}
		System.out.println("sum : "+sum);
	}
}