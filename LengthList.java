//how long is the linked list 
import java.util.*;
public class LengthList
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		Link[] ar = new Link[num];
		for(int i=0;i<num;i++)
		{
			ar[i]=new Link(sc.nextLine());
		}
		while(sc.hasNext())
		{
			int select = sc.nextInt();
			int next = sc.nextInt();
			if(next!=-1)
			{
				ar[select].next=ar[next];
			}
		}
		LinkedList myL = new LinkedList();
		if(num>0)
		{
			myL.first=ar[0];
		}
		System.out.println(findLoopLength(myL));
	}
	public static int findLoopLength(LinkedList myL)
	{
		if(myL.isEmpty())
		{
			return(0);
		}
		Link[] checkL = new Link[100];
		int counter = 0;
		Link forwards = myL.first;
		while(forwards.next!=null)
		{
			checkL[counter]=forwards;
			for(int i=0;i<counter;i++)
			{
				if(forwards==checkL[i])
				{
					return(counter-i);
				}
			}
			forwards=forwards.next;
			counter++;
		}
		return(0);
	}
}
class Link
{
	public String data;
	public Link next;
	public Link(String input)
	{
		data=input;
		next=null;
	}
}
class LinkedList
{
	public Link first;
	public LinkedList( )
	{
		first=null;
	}
	public boolean isEmpty( )
	{
		return (first==null);
	}
	public void insertHead(Link insert)
	{
		if(isEmpty())
		{
			first=insert;
		}
		else
		{
			insert.next=first;
			first=insert;
		}
	}
}
