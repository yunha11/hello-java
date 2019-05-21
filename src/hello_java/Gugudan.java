package hello_java;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println(num);
		
		for(int i=1;i<=9;i++)
		{
			System.out.println(num*i);
		}
	}
}
