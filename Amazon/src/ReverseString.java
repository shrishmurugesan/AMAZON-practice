import java.util.*;
import java.io.*;

public class ReverseString {

	public static void main(String a[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		String forward = sc.nextLine();
		
		StringBuilder reverse = new StringBuilder();
		
		for(int i=forward.length()-1; i>=0; i--)
		{
			reverse.append(forward.charAt(i));
		}
		
		System.out.println(reverse.toString());
		
		sc.close();
		
	}
}
