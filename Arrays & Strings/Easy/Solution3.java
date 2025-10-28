import java.util.HashSet;

public class Solution3 {
    public boolean isContainsDuplicate(int[] nums) {
       HashSet<Integer>set=new HashSet<>();
       for(int num:nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
       } 
       return false;
    }
}