//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
		Collections.sort(ray);
		int bigIndex = ray.size() - 1;
		double smallest=ray.get(0);
		double biggest = ray.get(bigIndex);
		return (smallest + biggest) / 2;
	}
}