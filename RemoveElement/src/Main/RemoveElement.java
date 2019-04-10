package Main;
/*
 * 移除数组中指定的元素
 */
public class RemoveElement {
	RemoveElement(){
	}
	public int RE(int []nums, int val) {
		int i = 0;
		for(int j=0; j<nums.length; j++) {
			if(nums[j]!=val) {
				nums[i]=nums[j];
				i++;
			}
		}
		return i;
	}
	public static void main(String args[]) {
		RemoveElement re = new RemoveElement();
		int []nums = {1,5,2,3,4,5,5};
		int len = re.RE(nums, 2);
		for(int i=0; i<len; i++)
			System.out.println(nums[i]);
	}
}
