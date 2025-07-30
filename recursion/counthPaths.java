public class counthPaths{
    public static int pathCount(int i,int j,int m,int n)
    {
       if(i==m || j==n){
        return 0;
       }
       if(i==m-1 && j==n-1)
       {
        return 1;
       }
       int downPath=pathCount(i+1,j,m,n);
       int rightPath=pathCount(i,j+1,m,n);
       return downPath+rightPath;
    }
    public static void main(String[] args){
      int m=3;
      int n=3;
      System.out.println(pathCount(0,0,m,n));
    }
}