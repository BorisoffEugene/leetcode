public class Main {
    public static void main(String[] args) {
        System.out.println(triangleType(new int[] {3,3,3}));
        System.out.println(triangleType(new int[] {3,4,5}));
    }

    public static String triangleType(int[] nums) {
        if (nums[0] == nums[1] && nums[1] == nums[2]) return "equilateral";

        if (nums[0] == nums[1] && nums[0] + nums[1] > nums[2]) return "isosceles";
        if (nums[0] == nums[2] && nums[0] + nums[2] > nums[1]) return "isosceles";
        if (nums[1] == nums[2] && nums[1] + nums[2] > nums[0]) return "isosceles";

        if (nums[0] + nums[1] <= nums[2]) return "none";
        if (nums[0] + nums[2] <= nums[1]) return "none";
        if (nums[1] + nums[2] <= nums[0]) return "none";

        return "scalene";
    }
}