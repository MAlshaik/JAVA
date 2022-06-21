//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class AtCounter
{
   private String[][] atMat;
   private int count = 0;

	public AtCounter() {
		count = 0;
		int val = (int)(Math.random()*20);
		atMat = new String[10][10];
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				int x = (int)(Math.random()* Integer.MAX_VALUE);
				if(val > 10) {
					val = (int) (Math.random() * 20);
					atMat[i][j] = "@";
				}else {
					val = (int) (Math.random() * 20);
					atMat[i][j] = "-";
				}
			}
		}
	}




	public int countAts(int r, int c) {
		if (((r >= 0) && (r < 10) && (c >= 0) && (c < 10) && atMat[r][c].contentEquals("@"))) {
			count = count + 1;
			atMat[r][c] = "";
			countAts(r - 1, c);
			countAts(r + 1, c);
			countAts(r, c + 1);
			countAts(r, c - 1);
		}
		return count;
	}

	public String toString()
	{
		String matrix = "";
		for(int i = 0; i < atMat.length; i++){
			for (int j = 0; j<atMat[0].length; j++) {
				matrix += atMat[i][j];
			}
			matrix += "\n";
		}

		return matrix;
	}
}