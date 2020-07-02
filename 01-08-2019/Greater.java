import java.lang.*;
public class Greater
{
	public static void main (String args[])
	{
		int n1 =20;
		int n2=30;
		int s=0;

		if (n1>n2) s=-1;
		if (n1==n2) s=0;
		if (n1<n2)  s=1;


		switch (s)
		{

			case -1:
			System.out.print(n1+" is greater than "+n2);
			break;

			case 0:
			System.out.print(n1 + " is equal to "+n2);
			break;

			case 1:
			System.out.print(n2+" is greater than "+n1);
			break;
		}

	}
}
