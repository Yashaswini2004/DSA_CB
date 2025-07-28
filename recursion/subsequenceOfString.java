public class subsequenceOfString{
    public static void sequence(String str,int idx, String newStr){
        if(idx==str.length()){
            System.out.print(newStr+" ");
            return;
        }
        char ch=str.charAt(idx);
        sequence(str,idx+1,newStr+ch);
        sequence(str,idx+1,newStr);
    }
    {

    }
    public static void main(String[] args){
        String str="abc";
        sequence(str,0,"");
    }
}