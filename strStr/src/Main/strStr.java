package Main;
/*
 * ����һ���ַ�������һ������λ��
 */
public class strStr {
	strStr(){
		
	}
	public int sS(String haystack, String needle) {
		if(needle == null)
			return -1;
		int l1 = haystack.length();
		int l2 = needle.length();
		if(l2 == 0)
			return 0;
		if(l1 < l2)
			return -1;
		for(int i = 0; i <= l1 - l2; i++ ) {
			if(haystack.substring(i, i+l2).equals(needle)) {//����ʹ��API
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		String str1 = "a";
		String str2 = "a";
		strStr s = new strStr();
		System.out.println(s.sS(str1, str2));
	}
}
