import java.util.ArrayList;
import java.util.logging.Level;

//import datastructures_practice.Node;

//class Node{
//    Node left;
//    Node right;
//    int data;
//    Node(int data){
//        this.left = null;
//        this.right = null;
//        this.data = data;
//    }
//
//}
public class LongestPathInTree {
	
	

    public static void main(String[] args) {
	// write your code here
        int arr[] = new int[10];
        int counter=0;
        Node root = new Node(5);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(8);
        root.left.right =  new Node(3);
        root.left.right.left =  new Node(9);
        root.right =  new Node(6);
        root.right.left = new Node(11);
        root.right.left.left = new Node(15);
        root.right.left.left.right = new Node(10);
        root.right.right = new Node(12);
        int h = height(root);
        //printLongestPath(root, arr, counter, h);
        printLongestPath(root);
        levelOrderTraverse(root);
    }
    
    public static void printLongestPath(Node root)
    {
    	int h = height(root);
    	ArrayList<Integer> trace = new ArrayList<>();
    	int counter =0;
    	
    	printLongestPath(root, trace, counter ,h);
    }

    public static void printLongestPath(Node root, ArrayList<Integer> arr, int counter, int h) 
    {
		if(root == null)
		{
			return;
		}
		
		
		arr.add(counter, root.data);
		counter++;
		if(counter == h)
		{
			System.out.print("[");
		for (int i = 0; i < counter; i++) {
			
			System.out.print(arr.get(i)+" ");
		}
			System.out.print("]\n");
			
		}

		
		else
		{
			printLongestPath(root.left,arr,counter,h);
			printLongestPath(root.right,arr,counter,h);
		}
		//System.out.println();
		
	}

	public static int height(Node root) 
	{
		if(root == null)
		{
			return 0;
		}
		
		else
		{
			return  1 + Math.max(height(root.left), height(root.right));
		}
		
		
	}
	
	public static void levelOrderTraverse(Node root)
	{
		int height = height(root);
		
		for(int i = 0; i<= height; i++)
		{
			printGivenLevel(root,i);
			System.out.println();
		}
		
	}

	public static void printGivenLevel(Node root, int i) {
		
		
		if(root == null)
		{
			return;
		}
		
		if(i == 1)
		{
			System.out.print(root.data+" ");
		}
		
		else
		{
			printGivenLevel(root.left, i-1);
			printGivenLevel(root.right, i -1);
		}
		
	}
    
}














