//Monte Carlo on a coin toss 
import java.util.*;
public class MonteCarlo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double tosses = sc.nextInt();
		double bias = sc.nextInt();
		double count = 0, sims = 1000;
		for(int i=0;i<sims;i++)
		{
			double total = 0;
			for(int j=0;j<tosses;j++)
			{
				if(Math.random()<bias/100.0)
				{
					total++;
				}
			}
			if(total>tosses/2.0)
			{
				count++;
			}
		}
		System.out.println((count*100/sims));
	}
}