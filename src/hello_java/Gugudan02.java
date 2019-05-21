package hello_java;
import java.util.Scanner;
public class Gugudan02 {
		public static void main(String args[])
		{
			int arr[]=new int[9];
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			for(int i=1;i<=9;i++)
			{
				arr[i-1]=num*i;
				System.out.println(arr[i-1]);
			}
			
		}
}
