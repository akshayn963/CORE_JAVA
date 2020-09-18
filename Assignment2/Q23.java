import java.util.Scanner;
class Q23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		System.out.println("Enter ele");
		for(int i=0;i<ar.length;i++){
			
			ar[i] = sc.nextInt();
		}
		System.out.println();  
		System.out.println("Reverse array : ");
		for(int i=ar.length-1;i>=0;i--){
			System.out.println(ar[i]);
		}
	}
}

