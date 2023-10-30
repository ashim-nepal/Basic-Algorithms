package euclideanGCD_05;
import java.lang.*;
import java.util.*;
/*
*
 * Euclidean Algorithm
 * By Ashim Nepal
 */

public class GCD_algo {
	// Additional Euclidean Algorithm
	public static int gcd(int a, int b) {
		if(a==0) {
			return b;
		}
		return gcd(b%a,a);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of times to gind GCD of two numbers: ");
		int times=sc.nextInt();	
		for (int i=0; i<times; i++) {
			System.out.print("Enter number 'a': ");
			int a = sc.nextInt();
			System.out.print("Enter number 'b': ");
			int b = sc.nextInt();
		
			int g = gcd(a,b);
			System.out.println("GCD(" +a+" , "+b+") = "+g);
			}
		}

}
