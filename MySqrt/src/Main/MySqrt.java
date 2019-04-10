/**
 * 
 */
package Main;

/**
 * @author Dongxu
 * 求一个数的平方根
 */
public class MySqrt {
	MySqrt(){
		
	}
	public int MS(int x) {
		int low = 0;
		int high = x;
		int mid;
		while(low <= high) {
			mid = (low + high) / 2;
			if(mid * mid == x) {
				return mid;
			}else if(mid * mid > x) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return high;
	}
	public int MS2(int x) {
		int low = 0;
		int high = x;
		while (low <= high) {
			long mid = (low + high) / 2;//防止溢出
			if (mid * mid == x)
				return (int) mid;
			else if (mid * mid < x)
				low = (int) (mid + 1);
			else
				high = (int) (mid - 1);
		}
		return high;
	}
	public static void main(String args[]) {
		int x = 2147395599;
		MySqrt tmp = new MySqrt();
		System.out.println(tmp.MS2(x));
	}
}
