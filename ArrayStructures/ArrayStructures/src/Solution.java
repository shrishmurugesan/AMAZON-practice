import java.io.*;
import java.util.*;
import java.lang.*;;

public class Solution {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int size = 0;
        
        
        size = reader.nextInt();
        int[] forwardArray = new int[size];
        int[] reverseArray = new int[size];
        
        for(int i=0; i<size;i++)
        {
           forwardArray[i] = reader.nextInt();   
        }
        
        for(int i=0;i<size;i++)
        {
        	System.out.print(forwardArray[i]+" ");
        	
        }
        System.out.println("");
        int k = size;
        int reverseIndex=0;
        for(int j=size-1; j>=0;j--)
        {
          reverseArray[reverseIndex] = forwardArray[j];
          reverseIndex++;
             
        }
       
        for(int l=0; l<size;l++)
        {
          System.out.print(reverseArray[l]+" ");   
        }
        
        reader.close();
    }
}