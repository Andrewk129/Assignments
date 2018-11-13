//Finding Mode 
import java.util.*;
public class Mode {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] data = new int[num];
		for(int i=0; i<num;i++)
		{
			data[i]=sc.nextInt();
		}
		int test = 0, testnum = 0;
		for(int i=0;i<num;i++)
		{
			int count = 0;
			for(int j=0;j<num;j++)
			{
				if(data[i]==data[j])
				{
					count++;
				}
			}
			if(count>test)
			{
				test = count;
				testnum = data[i];
			}
		}
		System.out.println(testnum);
		
	}
}