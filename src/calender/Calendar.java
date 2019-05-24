package calender;

import java.util.Scanner;

public class Calendar {

	private static final int[] month = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] leaf_month = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
		
	public boolean isLeapYear(int y) {
		if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))
			return true;
		else
			return false;
	}
	
	public int getDays(int y, int m)
	{
		if(isLeapYear(y)) return leaf_month[m-1];
		else return month[m-1];
	}
	
	public void printCalendar(int y, int m, int w)
	{
		System.out.println("\t<<%4d년 %2d월>>");
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("----------------------");
		
		int maxDay = getDays(y, m);
		
		for(int i=0; i<w; i++)
			System.out.print("   ");
		
		for(int i=1; i<= maxDay; i++)
		{
			if((i+w)%7==0)
				System.out.printf(" %2d\n", i);
			else
				System.out.printf(" %2d", i);
		}
		
		System.out.printf("\n");
	}
	
	public void printCalendar(int y, int m)
	{
		System.out.println("\t<<%4d년 %2d월>>");
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("----------------------");
		
		int weekday = getWeekDay(y, m, 1); 
		
		for(int i=0; i<weekday; i++)
			System.out.print("   ");
		
		int maxDay = getDays(y, m);
		int count = 7 - weekday;
		int delim = (count < 7) ? count : 0;
		
		// print first line
		for (int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();

		// print from second line to last

		count++;
		for (int i = count; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == delim)
				System.out.println();
		}

		System.out.printf("\n");
	}
	
	private int getWeekDay(int year, int month, int day) {
		int syear = 1970;
		final int STANDARD_WEEKDAY = 3; //1970/Jan/1st = Thursday
		
		int count = 0;
		
		for (int i = syear; i < year; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		
		//System.out.println(count);
		for (int i = 1; i < month; i++) {
			int delta = getDays(year, i);
			count += delta;
		}
		
		count += day;
		
		int weekday = (count + STANDARD_WEEKDAY) % 7;
		return weekday;
	}
}
