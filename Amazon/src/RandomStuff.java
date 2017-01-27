import java.util.Arrays;
import java.sql.CallableStatement;;
public class RandomStuff {

	{System.out.println("Initializing an object of RandomStuff\n");}
	public static void main(String naughtyamerica[])
	{
		int[] test = new int[10];
		
		for(int i = 0; i<test.length;i++)
		{
			test[i] = i;

		}
		int[] truncated = Arrays.copyOf(test, 20);
		
		for (int i : truncated) {
			System.out.print(i+" ");
			
			
		
		
		
		}
		int shifter = 10 + 'c';
		//shifter = shifter << 4;
		System.out.println("\nShifter is now "+shifter);
		String a = "Boobs are awesome";
		System.out.println(a);
		char[] charArray = {11,12,13,14,15};
		char c = 'c';
		System.out.println();
		StringBuilder test1 = new StringBuilder();
		StringBuilder test2 = test1;
		String check = "blabittybloobity";
		StringBuilder sb = new StringBuilder("Boobs");
		System.out.println();
		System.out.println(test.toString());
		test1.append("Wells");
		test2.append(" Fargo");
		System.out.println("SB object test1 contains :"+test1.toString());
		System.out.println("SB object test2 contains :"+test2.toString());
		
	}
	
	{System.out.println("what happens if I put an block here?");}
}
