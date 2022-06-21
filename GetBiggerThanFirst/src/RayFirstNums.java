//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RayFirstNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static int[] go(int[] ray)
	{
		ArrayList<Integer> big = new ArrayList<Integer>();
		int x = 0;
		for(int i=0;i<ray.length;i++){
			if(ray[i] > ray[0]) {
				big.add(ray[i]);
				x++;
			}
		}
		int[] num = new int[big.size()];
		for (int i=0;i<big.size();i++){
			num[i] = big.get(i);
		}
		return num;
	}
}