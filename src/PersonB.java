import java.util.Scanner;

public class PersonB 
{
	public static void main( str[])
	{
		System.out.println("Please enter your name?");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		String out;
		for (int i = name.length() - 1; i >= 0; i--)
		{
			out += name.substring(i, i + 1);
		}
		System.out.println(out)
	}
}
