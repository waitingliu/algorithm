package algorithm;

/*
 * 爬楼梯，一次可以爬一级，也可以爬两级，有多少种爬法？
 * 斐波那契数列
 * */
public class ClimbStairs {
	public static int climb(int n){
		int[] cache = {1,1,1};
		if(n<2){
			return cache[2];
		}
		for(int i=2; i<=n; i++){
			cache[2] = cache[0]+cache[1];
			cache[0] = cache[1];
			cache[1] = cache[2];
		}
		return cache[2];
	}
	public static void main(String args[]){
		int result = ClimbStairs.climb(10);
		System.out.println(result);
	}
}
