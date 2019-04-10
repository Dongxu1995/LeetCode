/**
 * 
 */
package Main;

import java.util.Stack;

/**
 * @author Dongxu
  * ≈–∂œ¿®∫≈ «∑Ò”––ß
 */
public class Valid_Bracket {
	public boolean isValid(String str) {
		Stack<Character> stk = new Stack<Character>();
		int num = str.length();
		for(int i = 0; i < num; i++) {
			char element = str.charAt(i);
			if(element=='('||element=='['||element=='{') {
				stk.push(element);
			}
			
			if(element==')'||element==']'||element=='}') {
				if(stk.isEmpty())
					return false;
				else if(element==')'&&stk.pop()=='(')
					continue;
				else if(element==']'&&stk.pop()=='[')
					continue;
				else if(element=='}'&&stk.pop()=='{') 
					continue;
				else
					return false;
			}
		}
		if(stk.isEmpty())
			return true;
		else
			return false;
	}
	public static void main(String args[]) {
		Valid_Bracket temp = new Valid_Bracket();
		System.out.println(temp.isValid("([)]"));
	}
}
