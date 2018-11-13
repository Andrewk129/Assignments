//Find Nth Prime 
import java.util.*;
public class Nprime {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=1, primenum=0;
		while(primenum!=num)
		{
			i++;
			boolean prime = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					prime = false;
				}
			}
			if(prime)
			{
				primenum++;
			}
		}
		System.out.println(i);
	}
}