//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;


public class ArrayListFunHouse
{
    public static ArrayList<Integer> getListOfFactors(int number) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= number; ++i) {
                if (number % i == 0) {
                    if(i != 1 && i != number) {
                    list.add(i);
                }
            }
        }
        return list;
    }

    public static void keepOnlyCompositeNumbers( List<Integer> nums ){
        for(int j = 0; j < nums.size(); j++){
            boolean flag = false;
            for(int i = 2; i <= nums.get(j)/2; ++i) {
                if(nums.get(j) % i == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                //System.arraycopy(nums, n + 1, nums, n, nums.size() - 1 - n);
                nums.remove(nums.get(j));
            }

        }
    }
}