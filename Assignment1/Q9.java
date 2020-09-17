import java.util.Scanner;

class Q9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of days :");
		int d=sc.nextInt();
		int years = d / 365;
		int months=d/30;
		int days= d/1;
		
        if(months >= 12)
		{
			months =months -12 *years;
			if(days >=365)
			{
				days=days -365 *years;
			}
		}
        System.out.println("years :"+years+" months :"+months+" days :"+days);
	}
}	
		