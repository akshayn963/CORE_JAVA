import java.util.*;
class Q20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
		for(int i = a ; i <= b ; i++)
		{
			temp = 0;
			for(int j = 1 ; j <= i ; j++)
			{
				if(i % j == 0)
					temp = temp+1;
			}
		
			if(temp == 2)
			{
         			System.out.println(i);
		
			}
		}
    }
}