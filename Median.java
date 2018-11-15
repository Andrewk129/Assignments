//The goal is to read in a list of students and exam scores into an 
//array and output the name of the student with the median score,
import java.util.*;
public class Median 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] ar = new String[num];
		for(int i=0;i<num;i++)
		{
			ar[i] = sc.nextLine();
		}
		for(int i=num-1;i>0;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(getNum(ar[j])>getNum(ar[j+1]))
				{
					String temp = ar[j];
					ar[j] = ar[j+i];
					ar[j+1] = temp;
				}
			}
		}
		System.out.println(getString(ar[(num-1)/2]));
	}
	public static int getNum(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				return Integer.parseInt(input.substring(i+1));
			}
		}
		return -1;
	}
	public static String getString(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				return input.substring(0,i);
			}
		}
		return "";
	}	
}
