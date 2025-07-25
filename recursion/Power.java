public class Power{
    public static void powerOfx(int x,int n,int res){
        if(n==0){
            System.out.println(res);
            return;
        }
         res*=x;
         n=n-1;
         powerOfx(x,n,res);
    }
    public static void main(String[] args){
        int x=2;
        int n=3;
        powerOfx(x,n,1);
    }
}