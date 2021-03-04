package pl.edu.pwsztar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sum(4));
    }


    static private int sum(int x) {
        int ans = 0;
        for(int i =0; i <= x; i++) {
            ans += i;
        }

        return ans;
    }
}
