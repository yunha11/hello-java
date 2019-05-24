package calender;

import java.util.Scanner;

public class Calendar {

	private static final int[] month = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getDays(int m)
	{
		return month[m-1];
	}
	
	public void printCalendar(int m)
	{
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("--------------------");
		
		int maxDay = getDays(m);
		
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
