package Main;
/**
 * @author Dongxu
  * 爬楼梯：动态规划，f(n) = f(n - 1) + f(n - 2)，1 2 3 5 8 13 ...
  * 斐波那契数列(超时，占空间小）递归时间过长， 非递归(占空间大，耗时间小）
 */
public class ClimbStairs {
	ClimbStairs(){
		
	}
	public int cs_recursion(int n) {
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		return cs_recursion(n-1) + cs_recursion(n-2);
		
	}
	
	 public int cs_nonrecursion(int n) {
	        int []arr = new int[n + 1];
	        if(n == 0)
	        	arr[0] = 0;
	        else if(n == 1)
	        	arr[1] = 1;
	        else if(n == 2)
	        	arr[2] = 2;
	        else if(n >= 3) {
	        	arr[1] = 1;
	        	arr[2] = 2;
	        	for(int i = 3; i <= n; i++) {
	        		arr[i] = arr[i - 1] + arr[i - 2];
	        	}
	        }
	        return arr[n];
	    }

	public static void main(String args[]) {
		ClimbStairs tmp = new ClimbStairs();
		System.out.println(tmp.cs_recursion(10));
		System.out.println(tmp.cs_nonrecursion(45));
	}
}
