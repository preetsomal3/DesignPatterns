package Recursion;

public class Kthgrammer {

	public static void main(String[] args) {

		int n = 2;
		int k =2;
		System.out.println(solve(n,k));
		
	}
	
	
	static int solve(int n, int k) {
		
		int size = exp(2,n-1);
		int mid =size/2;
		
		if(n==1 & k==1) {
			
			return 0;
		}
		
		if(k<=mid) {
			
			return solve(n-1,k);
		}else {
			
			int res = solve(n-1,k-mid);
			return compliment(res);
		}
		
		
	}
	
	static int compliment(int result) {
		
		return result==0?1:0;
	}
	
	static int exp(int a, int b) {
		int r=1;
		if(b==0) {
			return 1;
		}
		for(int i=1;i<=b;i++) {
		r=r*a;
	}
	return r;

}
}