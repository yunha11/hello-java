package hello_java;
public class Gugudan04 {

	public static int[] gugu(int x)
	{
		int[] arr = new int[x];
		for(int i=1;i<=x;i++)
		{
			arr[i-1] = x*i;
		}
		return arr;
	}
	
	public static int[] gugu(int x, int y)
	{
		int cnt = (x-1)*y;
		int[] arr = new int[cnt];
		int k=0;
		
			for(int i=2;i<=x;i++)
			{
				for(int j=1;j<=y;j++)
				{
					arr[k]=i*j;
					k++;
				}
				
			}
		
		return arr;
	}
	
	public static void view(int[] a)
	{
		for(int i:a)
		{
			System.out.println(i);
		}
	}
}
