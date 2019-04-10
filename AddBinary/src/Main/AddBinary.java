/**
 * 
 */
package Main;

/**
 * @author Dongxu
 * 二进制相加(可以转成整数数组求解）
 */
public class AddBinary {
	AddBinary(){
		
	}
	public String ab(String a, String b) {
		 String result="";
		 int sum = 0;
		 int len1 = a.length();
		 int len2 = b.length();
		 while(len1 > 0|| len2 > 0) {
//			 System.out.println(len1);
			 if(len1 > 0) {
				 sum += Integer.parseInt(a.substring(len1-1, len1));
				 len1--;
			 }
			 if(len2 > 0) {
				 sum += Integer.parseInt(b.substring(len2-1, len2));
				 len2--;
			 }
			 if(sum == 2) {
				 result = "0" +result;
				 sum = 1;
			 }else if(sum == 3) {
				 result = "1" + result;
				 sum = 1;
			 }else {
				 result = sum +result;
				 sum = 0;
			 }
		 }
		 if(sum == 1) {
			 result = "1" + result;
		 }
		return result;
	}
	public static void main(String args[]) {
		AddBinary tmp = new AddBinary();
		String a = "11";
		String b = "1";
		System.out.println(tmp.ab(a, b));
	}
}
