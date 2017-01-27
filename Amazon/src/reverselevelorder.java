import java.util.*;


public class reverselevelorder {
	static ArrayList<Integer> list = new ArrayList<>();
	//static LinkedHashSet<Integer> list = new LinkedHashSet<>();
	//static TreeSet<Integer> list = new TreeSet<>();

	public static void main(String a[])
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		printReverseLevelOrder(root);
		for (int l : list) {
			System.out.print(l+", ");
		}
	}

	private static void printReverseLevelOrder(Node root) 
	{
		int height = getHeight(root);
		for (int i = height; i >=0; i--) {
			printGivenLevel(root,i);
		}
		
	}

	private static void printGivenLevel(Node root, int level) {
		if(root == null)
			return;
		if(level == 1)
			//System.out.print(root);
			list.add(root.data);
		else if(level >1)
		{
			printGivenLevel(root.left,level-1);
			printGivenLevel(root.right,level-1);
		}
		
	}

	private static int getHeight(Node root) {
		if(root == null)
			return 0;
		else
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}

}
