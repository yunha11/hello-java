package hello_java;

public class Gugudan03 {

	public static int[] gugu(int x)
	{
		int[] rst = new int[9];
		for(int i=1;i<=9;i++)
		{
			rst[i-1]=x*i;
		}
		return rst;
	}
	
	public static void view(int[] arr)
	{
		for(int a:arr)
			System.out.println(a);
	}
	
	public static void main(String args[])
	{
		for(int i=2;i<=9;i++)
		{
			int[] result = gugu(i);
			view(result);
		}
		
	}
}
