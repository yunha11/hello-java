package calender;

import java.util.Scanner;

public class CalenderMain {

	public static int[] month = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("월을 입력하세요.");
			System.out.print(">");
			int mon = scanner.nextInt();
			if(mon==-1) break;
	
			System.out.printf("%d월은 %d일까지 있습니다.\n", mon, month[mon-1]);
			
			
			
		}
		
		scanner.close();
	}
}
