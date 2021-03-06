//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Arrays;

public class GetFirstRunner {
	public static void main( String args[] ) {
		/*
		[-99,1,2,3,4,5,6,7,8,9,10,12345]

		[10,9,8,7,6,5,4,3,2,1,-99]

		[10,20,30,40,50,-11818,40,30,20,10]

		[32767]

		[255,255]

		[9,10,-88,100,-555,1000]

		[10,10,10,11,456]

		[-111,1,2,3,9,11,20,30]

		[9,8,7,6,5,4,3,2,0,-2,-989]

		[12,15,18,21,23,1000]

		[250,19,17,15,13,11,10,9,6,3,2,1,-455]

		[9,10,-8,10000,-5000,1000]
		 */

		RayFirstNums rayFirstNums = new RayFirstNums();
		int[] ray = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(Arrays.toString(rayFirstNums.go(ray)));
		System.out.println("\n");

		int[] ray1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		System.out.println(Arrays.toString(rayFirstNums.go(ray1)));
		System.out.println("\n");

		int[] ray2 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(Arrays.toString(rayFirstNums.go(ray2)));
		System.out.println("\n");

		int[] ray3 = {32767};
		System.out.println(Arrays.toString(rayFirstNums.go(ray3)));
		System.out.println("\n");

		int[] ray4 = {255,255};
		System.out.println(Arrays.toString(rayFirstNums.go(ray4)));
		System.out.println("\n");

		int[] ray5 = {9,10,-88,100,-555,1000};
		System.out.println(Arrays.toString(rayFirstNums.go(ray5)));
		System.out.println("\n");

		int[] ray6 = {10,10,10,11,456};
		System.out.println(Arrays.toString(rayFirstNums.go(ray6)));
		System.out.println("\n");

		int[] ray8 = {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println(Arrays.toString(rayFirstNums.go(ray8)));
		System.out.println("\n");

		int[] ray9 = {12,15,18,21,23,1000};
		System.out.println(Arrays.toString(rayFirstNums.go(ray9)));
		System.out.println("\n");

		int[] ray10 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(Arrays.toString(rayFirstNums.go(ray10)));
		System.out.println("\n");

		int[] ray11 = {9,10,-8,10000,-5000,1000};
		System.out.println(Arrays.toString(rayFirstNums.go(ray11)));
		System.out.println("\n");





	}
}