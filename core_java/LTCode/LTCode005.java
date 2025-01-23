package LTCode;
import java.util.Arrays;
public class LTCode005{
    public static void main(String[] args) {
        Solution4 solution4=new Solution4();
        int[] nums={2,7,11,15};
        int target=9;
        int[] result =  solution4.twoSum(nums,target);
       
        System.out.println(Arrays.toString(result));
    }
} 