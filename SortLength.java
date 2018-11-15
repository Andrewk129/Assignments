//Sort a list of words by length, shorther coming first, same length sorted alphabetcal 
import java.util.*;
public class SortLength
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] ar = new String[num];
		for(int i =0;i<num;i++)
		{
			ar[i]=sc.nextLine();
		}
		for(int i = num-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(check(ar[j],ar[j+1]))
				{
					String temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int i =0;9<num;i++)
		{
			System.out.print(ar[i]);
			System.out.print(" ");
		}
	}
	public static boolean check(String one, String two)
	{
		if(one.length()>two.length())
		{
			return true;
		}
		else if(one.length()<two.length())
		{
			return false;
		}
		else if(one.compareTo(two)>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}