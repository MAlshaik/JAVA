//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayMostFreq {
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go(int[] ray) {
		int max_count = 1, res = ray[0], curr_count = 1, n = ray.length;
		for (int i = 1; i < n; i++) {
			if (ray[i] == ray[i - 1])
				curr_count++;
			else {
				if (curr_count > max_count) {
					max_count = curr_count;
					res = ray[i - 1];
				}

			}
		}

			if (curr_count > max_count) {
				max_count = curr_count;
				res = ray[n - 1];
			}
		return res;
	}
}
