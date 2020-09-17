import java.util.*;

class Q7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of subject 1");
		int s1=sc.nextInt();
		System.out.println("Enter marks of subject 2");
		int s2=sc.nextInt();
		System.out.println("Enter marks of subject 3");
		int s3=sc.nextInt();
		System.out.println("Enter marks of subject 4");
		int s4=sc.nextInt();
		System.out.println("Enter marks of subject 5");
		int s5=sc.nextInt();
		
		int sum=s1+s2+s3+s4+s5;
		
	    double per =(double)(sum / 5);
		
		System.out.println("sum of marks ="+sum);
		System.out.println("percentage ="+per+ "%");
	}
}	