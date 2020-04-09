import java.util.Scanner;

public class lab8_1 {
    public static long findMax(long[] nums) {
        long cM, pm = nums[0], c_m, pM=nums[0];
        long ans = nums[0];
        for(int i = 1; i < nums.length; i++){
                cM = Math.max(nums[i], Math.max(nums[i]*pm, nums[i]*pM));
                c_m = Math.min(nums[i], Math.min(nums[i]*pm, nums[i]*pM));
                ans = Math.max(ans,cM);
                pM = c_m;
                pm = cM;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long[] arr = new long[(int) num];
        for (int i = 0 ; i < num ; i++){
            int input_num = sc.nextInt();
            arr[i] = input_num ;
        }
        long ans = findMax(arr);
        System.out.println(ans);

    }
}
