//Finding Second biggest int
import java.util.*;
public class Biggest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//Set up sc to take inputs from user 
		int num = sc.nextInt();
		//num being the number of Ints to be entered 
		int test = Integer.MIN_VALUE;
		int test2 = Integer.MIN_VALUE;
		for(int i=0;i<num;i++)
		{
			//Go through inputs one by one 
			int input = sc.nextInt();
			if(input>test)
			{
				test2 = test;
				test = input;
			}
			else
			{
				if(input>test2)
				{
					test2 = input;
				}
			}
		}
		System.out.println(test2);
	}
}