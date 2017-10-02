import java.util.Scanner;

public class Start
{
	static String ingredName, input;
	static int menge;
	static Scanner scan = new Scanner(System.in);
	
	static Recipe addnewRecipe()
	{
		Recipe r = new Recipe();
		
		System.out.println("Neues Rezept erstellen\n\nRezeptname:");
		r.inputName(readLine());
		
		System.out.println();
		
		System.out.println("Schwierigkeitsgrad (1 - 5):");
		r.inputDifficulty(readInt());
		
		System.out.println();
		
		System.out.println("Zeitaufwand in Minuten:");
		r.inputTime(readInt());
		
		System.out.println();
		
		do
		{
			System.out.println("Zutat:");
			ingredName = readLine();
			
			System.out.println();
			
			System.out.println("Maßeinheit:");
			Ingred.MeasureDE einheit = Ingred.strToMeasure(readLine());
			
			System.out.println();
			
			System.out.println("Menge:");
			menge = readInt();
			
			Ingred newIngred = new Ingred(menge, ingredName, einheit);
			r.addIngred(newIngred);
			
			System.out.println();
			
			System.out.println("weitere Zutat? j/n");
			input = readLine();
			
			System.out.println();
		}
		while(input.toLowerCase().trim().equals("j")||input.toLowerCase().trim().equals("ja"));
		
		System.out.println("Notizen: ");
		r.inputNote(readLine());
		
		System.out.println("\n\n\n");
		
		return r;
	}
	
	static void editRecipe()
	{
		
	}
	
	static void deleteRecipe()
	{
		
	}
	
	static void addnewIngred()
	{
		
	}
	
	static void editIngred()
	{
		
	}
	
	static void deleteIngred()
	{
		
	}
	
	static String readLine()
	{
		String line;
		while((line = scan.nextLine()).isEmpty());
		return line;
	}
	
	static int readInt()
	{
		int i;
		i = scan.nextInt();
		return i;
	}
	
	public static void main(String[] args)
	{
		Recipe recipe=addnewRecipe();
		System.out.println(recipe);
		
		scan.close();
	}

}
