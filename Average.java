//Find average 
import java.util.*;
public class Average {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] ar = new int[num];
		double sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = sc.nextInt();
			sum += ar[x];
		}
		double avg = (sum/ar.length);
		double closest = Math.abs(ar[0]-avg);
		int index = 0;
		for(int j=0;j<ar.length;j++)
		{
			if(Math.abs(ar[j]-avg)<closest)
			{
				closest = Math.abs(ar[j]-avg);
				index = j;
			}
		}
		System.out.println(ar[index]);
	}
}