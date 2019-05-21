package calender;

import java.util.Scanner;

public class Month {

	public static void main(String args[])
	{
		int[] month=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println("달을 입력하세요. ");
		
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		
		try
		{
			System.out.println(mon+"월은 "+month[mon-1]+"일까지 있습니다.");
		}catch(Exception e)
		{
			
		}
		
		
	}
}
