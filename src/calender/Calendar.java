package calender;

import java.util.Scanner;

public class Calendar {

	private static final int[] month = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] leaf_month = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};
	
	public int getDays(int y, int m)
	{
		if(y%4==0) return leaf_month[m-1];
		else return month[m-1];
	}
	
	public void printCalendar(int y, int m)
	{
		System.out.println("\t<<%4d년 %2d월>>");
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("--------------------");
		
		int maxDay = getDays(y, m);
		
		for(int i=1; i<= maxDay; i++)
		{
			if(i%7==0)
				System.out.printf(" %2d\n", i);
			else
				System.out.printf(" %2d", i);
		}
		
		System.out.printf("\n");
	}
}
