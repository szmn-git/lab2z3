package pl.edu.pwsztar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print(sum(4));
    }

    public static int sum(int n){
        if (n == 0) return 0;
        else return sum(n-1)+n;
    }
}
