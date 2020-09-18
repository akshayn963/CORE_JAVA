import java.util.Scanner;
class Q21
{
    public static void main(String[] args) 
    {
        int sum = 0;
        float average;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < 10 ; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / 10;
        System.out.println("Average:"+average);
    }
}