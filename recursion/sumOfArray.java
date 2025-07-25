public class sumOfArray{
    public static void sumOfArray(int i,int len,int sum,int[] nums){
        if(i==len)
        {
            sum+=nums[i];
            System.out.println(sum);
            return;
        }
        sum+=nums[i];
        i++;
        sumOfArray(i,len,sum,nums);
        System.out.println(i);
        
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        sumOfArray(0,nums.length-1,0,nums);
    }
}