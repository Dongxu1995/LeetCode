/**
 * 
 */
package Main;

/**
 * @author Dongxu
 * 求最长公共前缀
 */
public class LongestCommonPrefix {
	public String LCP(String[]strs) {
		String result = "";		
		if(strs.length==0) {
			return result;
		}
		int min_length = strs[0].length();

		for(int i = 1; i < strs.length; i++) {
			if(strs[i].length() < min_length) {
				min_length = strs[i].length();
			}
		}
		for(int i = 0; i < min_length; i++) {
			char tmp_value = strs[0].charAt(i);
			for(int j = 0; j < strs.length; j++) {
				if(tmp_value != strs[j].charAt(i)) {
					return "\"" + result + "\"";
				}
			}
			result = result + tmp_value;
		}
		return "\"" + result + "\"";
	}
	public static void main(String args[]) {
		String strs[] = {};
		LongestCommonPrefix test = new LongestCommonPrefix();
		System.out.println(test.LCP(strs));
	}
}
