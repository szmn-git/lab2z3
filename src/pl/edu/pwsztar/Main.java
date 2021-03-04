package pl.edu.pwsztar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sum(4));
        System.out.print(sumR(4));
    }


    static private int sum(int x) {
        int ans = 0;
        for(int i =0; i <= x; i++) {
            ans += i;
        }
        return ans;
    }

    public static int sumR(int n){
        if (n == 0) return 0;
        else return sum(n-1)+n;
    }
}
