//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
	public static int go( List<Integer> ray )
	{
		int num = 0;
		for(int i : ray){
			num += i;
		}
		return num;
	}
}