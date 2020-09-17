import java.util.Scanner;

class Q12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary : ");
		int sal =sc.nextInt();
		
		if(sal <10000)
		{
			double hra =(sal *10)/100;
			System.out.println(hra);
			double DA= (sal*90)/100;
			System.out.println(DA);
			double GS= sal+DA+hra;
			System.out.println("GS is : "+GS);
		}
		
		if(sal >=10000)
		{
			double hra =2000;
			System.out.println(hra);
			double DA= (sal*90)/100;
			System.out.println(DA);
			double GS= sal+DA+hra;
			System.out.println("GS is : "+GS);
		}
	}
}