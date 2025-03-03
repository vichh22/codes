public class Main
{
    static void selection(int n, int[]nums)
    {
        int min, temp;
       for (int i=0;i<n-1;i++){
           min=i;
           for (int j=i+1;j<n ;j++)
           {
               if (nums[j]<nums[min])
                   min = j;
                   
                
               
           }
           temp = nums[min];
           nums[min]= nums[i];
           nums[i]=temp;
       } 
    }
    public static void main(String[]args)
    {
        int []nums ={2,3,12,56,9,34,99,102};
        selection(7,nums);
        for (int a:nums){
            System.out.print(a+ " ");
        }
    }
}
