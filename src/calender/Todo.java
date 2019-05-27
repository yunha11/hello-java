package calender;

import java.util.Scanner;
import java.text.ParseException;
import java.util.HashMap;
import java.io.File;

public class Todo {
	private static final String PROMPT = "> ";
	private static final String[] weekday = new String[] {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};

	/**
	 * 
	 * @param w	요일명
	 * @return 0:일요일 ~ 6:토요일
	 */
	public int parseDay(String w)
	{
		switch(w)
		{
		case "SU":
			return 0;
		case "MO":
			return 1;
		case "TU":
			return 2;
		case "WE":
			return 3;
		case "TH":
			return 4;
		case "FR":
			return 5;
		case "SA":
			return 6;
		default:
			return 0;
				
		}
	}
	
	private static void printMenu()
	{
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록           ");
		System.out.println("| 2. 일정 검색           ");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
		
	}
	
	public void newSchedule(Scanner s, Calendar c) throws ParseException
	{
		System.out.println("[일정 등록] 날짜를 입력하세요.");
		System.out.print(PROMPT);
		String date = s.next();
		String text = "";
   //     s.nextLine(); //ignore one newline
        
		System.out.println("일정을 입력하세요.(문장의 마지막에 ;입력)");
		System.out.print(PROMPT);
		while(true)
		{
			String word = s.next();
			text += word + " ";
			if(word.endsWith(";"))
				break;
			
		}
		
		c.registerPlan(date, text);
	//	h.put(inDay, inSch);
		
	}
	
	
	private void findSchedule(Scanner s, Calendar c) //throws ParseException
	{
		System.out.println("[일정 검색] 날짜를 입력하세요.");
		System.out.print(PROMPT);
		String date = s.next();
		
	//	String find = (String) h.get(inDay);
	//	String find = c.searchPlan(date);
		
		PlanItem find;
		find = c.searchPlan(date);
		if(find != null) System.out.println(find.detail);
		else System.out.println("일정이 없습니다.");
		
	}
	private void showCalendar(Scanner s, Calendar cal)
	{
				
		System.out.println("해를 입력하세요.");
		System.out.print("YEAR> ");
		int year = s.nextInt();
		
		System.out.println("월을 입력하세요.");
		System.out.print("MONTH> ");
		int mon = s.nextInt();
		if(mon==-1) return;

		cal.printCalendar(year, mon);
		
	}
	
	public void runPromt() throws ParseException
	{	
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();
		HashMap<String, String> hm = new HashMap<String, String>();
		
		boolean isLoop=true;
		
		while(isLoop)
		{	
			System.out.println("명령 (1, 2, 3, h, q)");
			System.out.print(PROMPT);

			String inst = sc.nextLine();
			switch(inst)
			{
			case "1":
				newSchedule(sc, cal);
				break;
			case "2":
				findSchedule(sc, cal);
				break;
			case "3":
				showCalendar(sc, cal);
				break;
			case "h":
				printMenu();
				break;
			case "q":
				isLoop = false;
				break;
			}
		}
		
		sc.close();
	}
	public static void main(String args[]) throws ParseException
	{
		
		Todo to = new Todo();
		printMenu();
		to.runPromt();
	}
}
