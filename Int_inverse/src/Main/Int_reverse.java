package Main;
/**
 * @author Dongxu
  * 翻转整数
 */
public class Int_reverse {
	public int reverse1(int x) {
		int backvalue = 0;
		while(x != 0) {
			int pop = x % 10;
			x /= 10;
			//需要考虑溢出问题
			if((backvalue > Integer.MAX_VALUE/10)||(backvalue == Integer.MAX_VALUE/10 && pop > 7)) {
				System.err.println("值溢出!!!");
				System.exit(0);
			}
			if((backvalue < Integer.MIN_VALUE/10)||(backvalue == Integer.MIN_VALUE/10 && pop <-8)) {
				System.err.println("值溢出!!!");
				System.exit(0);
			}
			backvalue = backvalue*10 + pop;
		}
		return backvalue;
	}
	
	public int reverse2(int x) {
		long result = 0;
		if(x > -10 && x <10) return x;
		boolean flag = true;
		if(x<0) {
			flag = false;
			x = -x;
		}
		while(x != 0) {
			result = result * 10 + x % 10;
			x = x / 10;
		}
		if(!flag) result = -result;
		if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			System.err.println("value of the overflow!!!");
			return 0;
		}
		return (int)result;
	}
	public static void main(String args[]) {
		Int_reverse ir = new Int_reverse();
		System.out.println(ir.reverse2(332));
	}
}
