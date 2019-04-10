/**
 * 
 */
package Main;

/**
 * @author Dongxu
 * 搜索有序数组的插入位置
 */
public class SearchInsert {
	SearchInsert(){
		
	}
	public int SI(int []nums, int target) {
		for(int i=0; i < nums.length; i++) {
			if(nums[i] > target)
				return i;
		}
		return nums.length;
	}
	public static void main(String args[]) {
		int nums[] = {1,3,5,7,9,10};
		SearchInsert tmp = new SearchInsert();
		System.out.println(tmp.SI(nums, 4));
	}
}
