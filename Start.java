import java.util.Scanner;

public class Start
{
	static String ingredName;
	static Scanner scan = new Scanner(System.in);
	
	static Recipe addnewRecipe()
	{
		Recipe r = new Recipe();
		
		System.out.println("Rezeptname:");
		r.inputName(readLine());
		
		System.out.println("Schwierigkeit/Aufwand:");
		r.inputDifficulty(readInt());
		
		System.out.println("Zutat:");
		ingredName = readLine();
		System.out.println("Maßeinheit:");
		Ingred.MeasureDE einheit = Ingred.strToMeasure(readLine());
		Ingred newIngred = new Ingred(ingredName, einheit);
		r.addIngred(newIngred);
		
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
