package cal;
import java.util.Scanner;

public class ClaMain {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		
		String[] splitedinput = input.split(" ");
		int a = Integer.parseInt(splitedinput[0]);
		int b = Integer.parseInt(splitedinput[1]);
		
		int rst = a+b;
		
		System.out.println(rst);
		
	}
}
