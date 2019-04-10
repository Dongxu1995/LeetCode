package Main;
/*
 * 输出最后一个单词的长度
 */
public class lengthOfLastWord {
	lengthOfLastWord(){
		
	}
	public int lolw(String s) {
		s = s.trim();
		if(s.length() == 0)
			return 0;
		int space_num1 = 0;//可以从后往前
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ')
				space_num1++;
		}
		int space_num2 = 0;
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(space_num1 == space_num2)
				count++;
			if(s.charAt(i) == ' ')
				space_num2++;
			
		}
		return count;
	}
	
	public int lolw2(String s) {
		if(s.trim().isEmpty())
			return 0;
		String []str = s.split(" ");
		return str[str.length-1].length();
	}
	public static void main(String args[]) {
		String str = "  ";
		lengthOfLastWord tmp = new lengthOfLastWord();
		System.out.println(tmp.lolw(str));
	}
}
