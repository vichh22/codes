import java.util.*;
public class Main{
    static void linear(int n,int[]nums)
    {
        for (int i=0;i<n ;i++ )
        {
            if (n==nums[i]){
                System.out.println("element found  at"+i);
                return;
            } 
        }
        System.out.println("element not found");
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] nums={12,3,2,22,4,44,5,55,67};
        System.out.println("enter the number to find the its Index");
        int n=sc.nextInt();
        linear(n,nums);
    }
}
