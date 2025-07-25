public class Fibonacci{
    public static void fibonacci(int a,int b,int n){
       int c=a+b;
        if(n==1){
            System.out.println(c);
            return;
        }
        a=b;
        b=c;
        n=n-1;
        fibonacci(a,b,n);
    }
    public static void main(String[] args){
        int n=7;
        fibonacci(0,1,n-2);
    }
}