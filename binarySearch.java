//about binary search works 
//find the middle element of the array 
// compare the middle element with target value
// if they match return the Index 
//if the target is less than the middle element, search the left half
//if the target is greater  than the middle element, search the right half
//repeat untill u reach the target 

import java.util.*;
public class Main{
    
    static int binary(int left,int right,int n,int[] nums){
        if(left<=right)
        {
            int mid = (left + right)/2;
            if(n==nums[mid])
            return mid;
            else if(n>nums[mid])
            return binary(mid+1,right,n,nums);
            else
            return binary(0,mid-1,n,nums);
            
        }
    
     return 200;   
}
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] nums={12,14,15,16,17,18,19,20,21,};
        System.out.println("enter the number to find the its Index");
        int n=sc.nextInt();
        int res =binary(0,8,n,nums);
        if (res!=200)
        System.out.println("Element found at "+res);
        else
        System.out.println("Element not found");
    }
}
