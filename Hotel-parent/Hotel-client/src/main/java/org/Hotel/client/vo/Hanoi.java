package work;


/**
 * @author Jerry
 *
 */
public class Hanoi {
	public static void moveDisk(int n,char a,char b,char c)
	{
		if(n==1)
		{
			System.out.println("move disk "+n+" form "+a+" to "+ c );
			
		}
		else
		{
			moveDisk(n-1,a,c,b);
			System.out.println("move disk "+n+" form "+a+" to "+c );
			moveDisk(n-1,b,a,c);
		}
	}
	public static void main(String[] args)
	{
		moveDisk(3,'A','B','C');
	}

}
