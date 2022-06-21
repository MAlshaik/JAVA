//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;

	public MadLib()
	{
		loadNouns();
		loadAdjectives();
		loadVerbs();
	}

	public MadLib(String fileName)
	{
		//load stuff
		try{

			Scanner file = new Scanner(new File(fileName));
			String story = file.nextLine();

			String randomN = getRandomNoun();

			String newStory = story.replaceAll("#", randomN);


		}
		catch(Exception e){
			out.println("problem");
		}
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("nouns.dat"));
			while(file.hasNextLine()){
				nouns.add(file.nextLine());

			}
			file.close();
		}
		catch(Exception e)
		{
			out.println(nouns.get(0));
		}			
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("verbs.dat"));
			while(file.hasNextLine()){
				verbs.add(file.nextLine());
			}
			file.close();
		}
		catch(Exception e)
		{
			out.println("error in verbs");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("adjectives.dat"));
			while(file.hasNextLine()){
				adjectives.add(file.nextLine());
			}
			file.close();
		}
		catch(Exception e)
		{
			out.println("error in adj");
		}
	}

	public String getRandomVerb()
	{
		Random Dice = new Random();
		int n = Dice.nextInt(6);
		return verbs.get(n);
	}
	
	public String getRandomNoun()
	{
		Random Dice = new Random();
		int n = Dice.nextInt(2);
		return nouns.get(0);
	}
	
	public String getRandomAdjective()
	{
		Random Dice = new Random();
		int n = Dice.nextInt(6);
		return adjectives.get(n);
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}