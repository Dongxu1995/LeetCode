package Main;
/**
 * @author Dongxu
  * 判断是否是回文数
 */
public class Palindramic_number {
	Palindramic_number(){
		
	}
	public boolean pal_num(int x) {
		int value = x;
		if(value < 0 || ((value % 10 == 0) && value != 0)) {
			return false;
		}
		int result = 0;
		while(value != 0) {
			result = result * 10 + value % 10;
			value /= 10;
		}
		
		if(x == result)
			return true;
		else
			return false;
	}
	public static void main(String args[]) {
		Palindramic_number temp = new Palindramic_number();
		System.out.println(temp.pal_num(1221));
	}
}
