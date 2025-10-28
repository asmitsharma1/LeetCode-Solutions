import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
       int n=nums.length;
       HashMap<Integer,Integer>mp=new HashMap<>();
         for(int i=0;i<n;i++){
            int remaining=target-nums[i];
            if(mp.containsKey(remaining)){
                return new int[]{mp.get(remaining),i};

         }
         mp.put(nums[i],i);
       }
       return new int[]{-1,-1};
       // Return -1, -1 if no solution is found
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of elements :");
            int n = sc.nextInt();
            System.out.println("Enter target value :");
            int target = sc.nextInt();

            int[] nums = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            TwoSum ts = new TwoSum();
            int[] result = ts.twoSum(nums, target);
            System.out.println("Indices: " + result[0] + " , " + result[1]);
        }
    }

}
