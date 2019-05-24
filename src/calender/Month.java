package calender;

import java.util.Scanner;

public class Month {

	private final static String PROMPT = "> "; 
	public void runPrompt() 
	{
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while(true)
		{
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			int mon = scanner.nextInt();
			if(mon==-1) break;
	
			int days = cal.getDays(mon);
			System.out.printf("%d월은 %d일까지 있습니다.\n", mon, days);
			
			cal.printCalendar(mon);
		
			

			
		}
		
		scanner.close();
	
	}
	public static void main(String args[])
	{
		Month p = new Month();
		p.runPrompt();
		
	}
}
