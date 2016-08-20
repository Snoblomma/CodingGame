import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
    	
    	int mindiff = 10000000;
    	
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
    	int array[] = new int[N];
            
        	for (int i = 0; i < N; i++) {
                int pi = in.nextInt();
                array[i] = pi;
                System.err.println("i = " + i + " " + pi);
            }
        	
        	//Quicksort:
        	Arrays.sort(array);
        	
        	for (int i = 0; i < N-1; i++)
        	{
	        	int k = Math.abs(array[i]-array[i+1]);
	        	if(k < mindiff){
	        		mindiff = k;
	        	}	
        	}
        	
        	System.out.println(mindiff);
    }
}
