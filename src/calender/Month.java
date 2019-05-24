package calender;

import java.util.Scanner;

public class Month {

//	private final static String PROMPT = "> ";
	private static final String[] weekday = new String[] {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
	
	public int parseDay(String w)
	{
		if(w.equals("SU")) return 0;
		else if(w.equals("MO")) return 1;
		else if(w.equals("TU")) return 2;
		else if(w.equals("WE")) return 3;
		else if(w.equals("TH")) return 4;
		else if(w.equals("FR")) return 5;
		else if(w.equals("SA")) return 6;
		else return 0;
	}
	
	public void runPrompt() 
	{
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while(true)
		{
			System.out.println("해를 입력하세요.");
			System.out.print("YEAR> ");
			int year = scanner.nextInt();
			
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			int mon = scanner.nextInt();
			if(mon==-1) break;
	
//			System.out.println("첫번째 요일을 입력하세요. SU MO TU WE TH FR SA");
//			System.out.print("WEEKDAY> ");
//			String str = scanner.next();
//			int wee = parseDay(str);
			
//			cal.printCalendar(year, mon, wee);
			cal.printCalendar(year, mon);
		}
		
		scanner.close();
	
	}
	public static void main(String args[])
	{
		Month p = new Month();
		p.runPrompt();
		
	}
}
