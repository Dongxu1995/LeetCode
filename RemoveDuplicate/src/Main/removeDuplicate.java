/**
 * 
 */
package Main;

/**
 * @author Dongxu
 * 移除数组中相同的元素
 */
public class removeDuplicate {
	public int removeDup(int []nums) {
		int len = 0;
		for(int i=1; i <nums.length; i++) {
			if(nums[len]!=nums[i]) {
				len++;
				nums[len] = nums[i];
			}
		}
		return len;
	}
	public static void main(String args[]) {
		removeDuplicate rd = new removeDuplicate();
		int []tmp={1,1,2,2,3,3,4,4};
		int len = rd.removeDup(tmp);
		for(int i=0; i<=len; i++) {
			System.out.println(tmp[i]);
		}
	}
}
