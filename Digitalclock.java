public class Main {
    public static void main(String[]args) throws InterruptedException
    {
        int h=8;
        int m=42;
        int s=0;
        while(true){
            System.out.printf("\r %02d : %02d : %02d ",h,m,s);
            System.out.flush();
            Thread.sleep(1000);

            s=s+1;

            if(s==60){
                m=m+1;
                s=0;
            }

            else if(m==60){
                h = h+1;
                m=0;
                s=0;
            }
        }
    }
}