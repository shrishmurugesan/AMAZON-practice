import java.util.*;

class Node{
    int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data = data;
	}
	public String toString()
	{
		String string = ""+data;
		return string;
	}
}
public class binarytreestring {
	
	  public static void findStringInTree(Node root, String input)
	{
		int[] digits = new int[input.length()];
		for(int i=0;i<input.length();i++)
		{
			digits[i] = Character.getNumericValue(input.charAt(i));
		}
		findFirstNode(root, digits[0], digits);
		
	}
//		private static int[] toDigits(String input) 
////		{
////		int[] digits = new int[input.length()];
////		for(int i=0;i<input.length();i++)
////		{
////			digits[i] = Character.getNumericValue(input.charAt(i));
////		}
////		return digits;
////	    }
		
		public static void findFirstNode(Node root, int c, int[] digits) {
		Node focusNode = root;
		if(focusNode == null)
		{
			System.out.println("the tree does not exist");
		}
		else if(focusNode.data == c)
		{
			checkForPath(focusNode,digits);
		}
		else
		{
			findFirstNode(focusNode.left,c,digits);
			findFirstNode(focusNode.right,c,digits);
		}
		
		
	}
	
		public static void checkForPath(Node focusNode, int[] digits) {
		int i=1;
		boolean isString = true;
		while(i < digits.length)
		{
			if(focusNode.left.data==digits[i])
			{
				i++;
				focusNode = focusNode.left;
				continue;
			}
			else if(focusNode.right.data == digits[i])
			{
				i++;
				focusNode = focusNode.right;
				continue;
			}
			else
			{
				isString = false;
				break;
			}
		}
		
		if(isString) System.out.println("String is found in tree");
		else System.out.println("String is not present in tree");
		
	}
	public static void main(String a[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number");
		String input = in.nextLine();
		Node root=new Node(3);
		root.left=new Node(4);
		root.right=new Node(5);
		root.left.left=new Node(6);
		root.left.right=new Node(7);
		root.right.left=new Node(8);
		root.right.right=new Node(9);
		
		findStringInTree(root, input);
		in.close();
		
	}
}


