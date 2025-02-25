class  Demo{
    void add (int... num){
        int sum=0;
        for (int i=0;i<num.length ;i++ ) {
            sum = sum+num[i];
        }
        System.out.println(sum);
    }
}

public class Main
{
    public static void main (String[] args) {
        Demo d = new Demo();
        d.add(2,3);
        d.add(2,3,5);
        d.add(2,3,9); 
    }
}
