/**
 * 
 */
package Main;

/**
 * @author Dongxu
 * 找到最大连续子数组和
 */
public class maxSubArray {
	maxSubArray(){
		
	}
	public int msa1(int []nums) {
		int sum;
		int max = nums[0];
		for(int i = 1; i < nums.length; i++) {
			for(int j = i; j < nums.length; j++) {
				sum = 0;
				for(int n = i; n < j; n++) {
					sum = sum + nums[n];
				}
				if(max < sum) {
					max = sum;
				}
			}
		}
		
		return max;
	}
	public int msa2(int []nums) {
		int sum;
		int max = nums[0];
		for(int i = 0; i < nums.length; i++) {
			sum = 0;
			for(int j = i; j < nums.length; j++) {
				sum = sum + nums[j];
				if(max < sum) {
					max = sum;
				}
			}
		}
		return max;
	}
	
	public int msa3(int []nums) {
		int sum = nums[0];
		int max = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(sum > 0) {
				sum += nums[i];
			}else {
				sum = nums[i];
			}
			
			if(max < sum) {
				max = sum;
			}
		}
		return max;
	}
	public static void main(String args[]) {
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		maxSubArray tmp = new maxSubArray();
		System.out.println(tmp.msa3(nums));
	}
}
