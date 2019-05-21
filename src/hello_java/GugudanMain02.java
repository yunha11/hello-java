package hello_java;

import java.util.Scanner;

public class GugudanMain02 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	//	int num = sc.nextInt();
		String str = sc.nextLine();
		
		String[] splitedstr = str.split(",");
		int x = Integer.parseInt(splitedstr[0]);
		int y = Integer.parseInt(splitedstr[1]);
		int[] rst = Gugudan04.gugu(x,y);
		Gugudan04.view(rst);
	}
}
