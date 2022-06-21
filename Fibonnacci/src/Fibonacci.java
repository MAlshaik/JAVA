//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;

public class Fibonacci
{
	int size = 1;
    ArrayList<Integer> seq;

    public Fibonacci(int size) {
        this.size = size;
        ArrayList<Integer> fibSeq = new ArrayList<Integer>();
        fibSeq.add(1);
        fibSeq.add(1);
        for(int i = 0; i < this.size; i++){
            fibSeq.add(fibSeq.get(i) + fibSeq.get((i + 1)));
        }
        fibSeq.set(10,-1);

        seq = fibSeq;
    }

	public void setFibo(int size){
	    this.size = size;
    }

	public int getFibo(int index){

        return seq.get(index-1);
    }


	//toString no need for a 2 string cuz of sample output
}