//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private int check = 0;

	public Maze(int size, String line)
	{
		check = size;
		int count = 0;
		Scanner scanner = new Scanner(line);
		List<Integer> list = new ArrayList<Integer>();
		while(count < size*size) {
			list.add(scanner.nextInt());
			count++;
		}
		maze = new int[size][size];

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					maze[i][j] = list.get(j%size+i*size);
				}
			}
	}

	public boolean hasExitPath(int r, int c) {
		if (r >= 0 && r < maze.length & c >= 0 && c < maze[0].length && maze[r][c] == 1) {
			maze[r][c] = 5;
			if (c == maze[0].length - 1)
				return true;
			else {
				if (r + 1 < maze.length - 1 && maze[r+1][c] == 1)
					hasExitPath(r + 1, c);
				if (c + 1 < maze[0].length - 1 && maze[r][c+1] == 1)
					hasExitPath(r, c + 1);
				if (c - 1 > 0 && maze[r][c-1] == 1)
					hasExitPath(r, c - 1);
				if (r - 1 >  0 && maze[r-1][c] == 1)
					hasExitPath(r - 1, c);

			}
		}
		return false;
		}

	public String toString()
	{
		int numCheck = check;
		String output="";
		for(int[] i : maze)
			for(int j : i){
				output += j;
				check++;
				if(check == numCheck + maze.length){
					output += "\n";
					numCheck = check;
				}
			}
		return output;
	}
}