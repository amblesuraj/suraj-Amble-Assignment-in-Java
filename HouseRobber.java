
public class HouseRobber {
    public static void main(String[] args) {


        int highvalsum[] = {2,3,2};
        int highvalsum1[] = {1,2,3,1};
        int highvalsum2[] = {0};

        System.out.println("Higest Value sum form {2,3,2} == "+rob(highvalsum));
        System.out.println("Higest Value sum form {1,2,3,1} == "+rob(highvalsum1));
        System.out.println("Higest Value sum form {0} == "+rob(highvalsum2));
    }
    public static int rob(int[] nums) {
        int n = nums.length;

        if(n == 0)
            return 0;

        if(n == 1)
            return nums[0];

        int value1 = nums[0];

        int value2 = Math.max(value1, nums[1]);

        for(int i = 2; i < n; ++i){
            int temp = value2;
            value2 = Math.max(value2, value1 + nums[i]);
            value1 = temp;
        }
        return value2;
    }
}
