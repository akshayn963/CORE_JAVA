import java.util.Scanner;

class Q15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the gender : ");
		char gender =sc.next().charAt(0);
		
		System.out.println("Enter the age : ");
		int age =sc.nextInt();
		if((gender == 'M' || gender == 'm') && age <21)
		{
			System.out.println("you are not allowed to get married");
		}
		else if((gender == 'F' || gender == 'f') && age <18)
		{
			System.out.println("you are not allowed to get married");
		}
		else
		{
			System.out.println("you are allowed to get married");
		}
	}
}