package Main;

import java.util.Arrays;

/*
 * 用数组表示整数,9和小于9的数分开
 */
public class PlusOne {
	PlusOne(){
		
	}
	public int[] po(int []digits){
		int l1 = digits.length;
		for(int i = l1 - 1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}else {
				digits[i] = 0;
			}
		}
		int []output = new int[l1 + 1];
		output[0] = 1;
		return output;
		
	}
	public static void main(String args[]) {
		PlusOne tmp = new PlusOne();
		int []a = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
		int []b = tmp.po(a);
		System.out.println(Arrays.toString(b));
	}
}
