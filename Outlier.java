//Finding Outlier
import java.util.*;
public class Outlier {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int min = Math.min(Math.min(one,two),three);
		int max = Math.max(Math.max(one,two),three);
		int middle = one+two+three-min-max;
		if(Math.abs(min-middle)==Math.abs(max-middle))
		{
			System.out.println("NA");
		}
		else if(Math.abs(min-middle)>Math.abs(max-middle))
		{
			System.out.println(min);
		}
		else
		{
			System.out.println(max);
		}
	}
}