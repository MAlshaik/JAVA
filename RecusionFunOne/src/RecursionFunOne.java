//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		int n = 0;
		int count = 0;
		for (int i = num; i != 0; i /= 10) {
			n = i % 10;
			if(n %2 == 0 ){
				count ++;
			}
		}
		return count;

	}
}