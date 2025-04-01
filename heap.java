//minheap
import java.util.PriorityQueue;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) {
	    PriorityQueue <Integer> minheap = new PriorityQueue<>();
	    
	    int[] arr = {10,20,30,5,2,3,12,45,90};
	    for (int a:arr){
	        minheap.add(a);
	    }
	    System.out.println(minheap);
	    while(!minheap.isEmpty()){
	        System.out.println(minheap.poll()+" ");
	    }
	    
	}
}



//maxheap
import java.util.PriorityQueue;
import java.util.Collections;

public class Main
{
	public static void main(String[] args) {
	    PriorityQueue <Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
	    
	    int[] arr = {10,20,30,5,2,3,12,45,90};
	    for (int a:arr){
	        maxheap.add(a);
	    }
	    System.out.println(maxheap);
	    while(!maxheap.isEmpty()){
	        System.out.println(maxheap.poll()+" ");
	    }
	    
	}
}
