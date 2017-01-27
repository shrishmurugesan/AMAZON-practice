

public class SumOfCharacters {
	
	public static void main(String a[])
	{
	String test = "abcdefghijklmnopqrstuvwxyz";
	
	char[] alpha = test.toUpperCase().toCharArray();
	
	int bal = 'A' - 64;
	
	//System.out.println(bal);
	
	//System.out.println(Character.getNumericValue('a'));
//	for (char c : alpha) {
//		System.out.print(c);
//	}
	
	System.out.println(computeChar('b'));
	System.out.println(computeChar('c'));
	System.out.println(computeString("abc"));
	System.out.println(Character.forDigit(26+9, 36));
	computeShortestString(100);
	}
	
	
	//input character always has to be uppercase
	public static int computeString(String input)
	{
		int value = 0;
		
		char[] compute = input.toCharArray();
		
		for (char c : compute) {
			value += computeChar(c);
		}
		
		return value;
	}
	
	public static int computeChar(char c)
	{
		int value = 0;   //n
		int numLoops = Character.getNumericValue(c) - 9;
		int iterationCounter = 1;
		while(numLoops > 0 )
		{
			value = (2 * value) + iterationCounter;
			iterationCounter++;
			numLoops--;
			
		}
		
		
		
		return value;
	}
	
	public static void computeShortestString(int limit)
	{
		StringBuilder sb = new StringBuilder();
		int maxCharacterSize = 26;
		int character = maxCharacterSize;
		
		while(limit > 0)
		{
			
			int characterValue = computeChar(Character.forDigit(character+9, 36));
			
			if(characterValue <= limit)
			{
				limit = limit - characterValue;
				sb.append(Character.forDigit(character+9, 36));
				continue;
			}
			else
			{
				character--;
			}
			
		}
		
		System.out.println(sb.toString());
		
	}
}














