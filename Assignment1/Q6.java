import java.util.Scanner;

class Q6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float rad=sc.nextFloat();
		float area=3.14F *rad;
		System.out.println("area of circle="+area);
		float circumference=2 * 3.14F * rad;
		System.out.println("circumference of circle="+circumference);
		
	}
}