import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner leo=new Scanner(System.in);
        System.out.println("Enter num 1: " );
        int a=leo.nextInt();
        System.out.println("Enter num 2: ");
        int b=leo.nextInt();
        int big=a>b?a:b;
        int lcm=big;
        while(true)
        {
            if(lcm%a==0 && lcm%b==0)
            break;
            else
            lcm=lcm+big;
        }
        System.out.println("LCM is "+lcm);
    }
}
