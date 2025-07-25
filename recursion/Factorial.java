public class Factorial{
    public static void fact(int i,int n,int res){
        if(n==i){
            System.out.println(res);
            return;
        }
        res*=i;
         i=i+1;
         fact(i,n,res);
    }
    public static void main(String[] args){
        int n=5;
        fact(1,n,1);
    }
}