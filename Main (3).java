/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args)   {
		
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		
		int []rank= {22,99,3,11,99,4,1};
		
		for(int val:rank){
		    pq.add(val);
		}
		
		while(pq.size()>0){
		    System.out.println(pq.peek());
		    pq.remove();
		}
	}
}
// HeapSort assending.
