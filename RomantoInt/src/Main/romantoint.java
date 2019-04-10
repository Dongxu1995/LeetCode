package Main;
/**
 * @author Dongxu
  * 罗马数字转整数
 */
import java.util.HashMap;
import java.util.Map;

public class romantoint {
	public int RtoI(String str) {
		int len = str.length();
		int result = 0;
		char letter[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		int value[] = {1, 5, 10, 50, 100, 500, 1000};
		int answer[] = new int[len];
		for(int i = 0; i < len; i ++) {
			for(int j = 0; j < 7; j++) {
				if(str.charAt(i) == letter[j]) {
					answer[i] = value[j];
					break;
				}
				if(j == 6) {
					System.err.println("This isn't Roman numerals!!!");
					return 0;
				}
			}
			
		}
		
		for(int i = 0; i < len - 1; i++) {
			if(answer[i] < answer[i + 1]) {
				answer[i+1] = answer[i + 1] - answer[i];
				answer[i] = 0;
			}
			result = result + answer[i];
		}
		result = result + answer[len-1];
		return result;
	}
	
	public int RtoImap(String str) {
		int result = 0;
		int len = str.length();
		Map<Character, Integer> Roman = new HashMap<Character, Integer>();
		Roman.put('I', 1);
		Roman.put('V', 5);
		Roman.put('X', 10);
		Roman.put('L', 50);
		Roman.put('C', 100);
		Roman.put('D', 500);
		Roman.put('M', 1000);
		result = Roman.get(str.charAt(0));
		int old = Roman.get(str.charAt(0));
		for(int i = 1; i < len; i++) {
			result = result + Roman.get(str.charAt(i));
			if(old < Roman.get(str.charAt(i))) {
				result = result - 2 * old;
			}
			old = Roman.get(str.charAt(i));
		}
		return result;
	}
	public static void main(String args[]) {
		long startTime=System.currentTimeMillis();   //获取开始时间
		romantoint temp = new romantoint();
		//"MCMXCIV"=1994
		System.out.println("Array:"+temp.RtoI("MCMXCIV"));
		System.out.println("Map:"+temp.RtoImap("MCMXCIV"));
		long endTime=System.currentTimeMillis(); //获取结束时间
		System.out.println("run time: "+(endTime-startTime)+" ms");
	}
}
