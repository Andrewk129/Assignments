//middle of queue 
import java.util.*;
public class MidQueue 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Queue myQ = new Queue(20);
		while(sc.hasNext())
		{
			String input = sc.nextLine();
			if(input.equals("REMOVE"))
			{
				if(!myQ.isEmpty())
				{
					myQ.remove();
				}
			}
			else
			{
				myQ.insert(input.substring(7,input.length()));
			}
		}
		if(!myQ.isEmpty())
		{
			int mid = myQ.size();
			if(mid%2==1)
			{
				mid++;
			}
			mid/=2;
			for(int i=0;i<mid-1;i++)
			{
				myQ.remove();
			}
			System.out.println(myQ.remove());
		}
		else
		{
			System.out.println("empty");
		}
	}
}

class Queue
{
	private int maxSize, front, rear, nItems;
	private String[] queArray;
	public Queue(int s)
	{
		maxSize=s;
		queArray = new String[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	public boolean insert(String item)
	{
		if(!isFull())
		{
			rear++;
			queArray[rear]=item;
			nItems++;
			return true;
		}
		else
		{
			return false;
		}
	}
	public String remove()
	{
		String temp = queArray[front];
		front++;
		if(front==maxSize)
		front=0;
		nItems--;
		return temp;
		
	}
	public boolean isEmpty()
	{
		return(nItems==0);
	}
	public boolean isFull()
	{
		return(nItems==maxSize);
	}
	public int size()
	{
	return nItems;
	}
}	