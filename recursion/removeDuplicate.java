public class removeDuplicate{
    public static boolean[] map=new boolean[26];
    public static void duplicates(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char ch=str.charAt(idx);
        if(map[ch-'a']==true){
           duplicates(str,idx+1,newStr);
        }
        else
        {
            newStr+=ch;
            map[ch-'a']=true;
            duplicates(str,idx+1,newStr);
        }
    }
    public static void main(String[] args){
        String str="abbcsseertwq";
        duplicates(str,0,"");
    }
}