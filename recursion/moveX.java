public class moveX{
    public static void movex(String str, String newStr, int idx,int count){
        if(idx==str.length())
        {
            for(int i=0;i<count;i++)
            {
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        char ch=str.charAt(idx);
        if(ch=='x'){
            count++;
            movex(str,newStr,idx+1,count);
        }else{
            newStr+=ch;
            movex(str,newStr,idx+1,count);
        }
    }
    public static void main(String[] args){
       String str="abxcxxdx";
       movex(str,"",0,0);
    }
}