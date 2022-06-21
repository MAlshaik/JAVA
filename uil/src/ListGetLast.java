//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Langston Martin
//Date - 3/3/2

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class ListGetLast
{
	//method go will return a list
	//containing the all of the values greater 
	//than the last value in the list

	public static List<Integer> go(List<Integer> ray )
	{
		ArrayList<Integer> array = new ArrayList();
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i) > ray.get(ray.size()-1)) {
				array.add(ray.get(i));
		   }
		}
		return array;
		}
















	}
