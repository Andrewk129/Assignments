//Nearest Prime 
import java.util.*;
public class Prime {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 2, ans = 0, test = num;
		while(i<2*num)
		{
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
				if(Math.abs(num-i)<test)
				{
					test = Math.abs(num-i);
					ans = i;
				}	
			}
			i++;
		}
		System.out.println(ans);
	}
}