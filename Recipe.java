import java.util.ArrayList;

class Recipe
{
	private String name, note;
	private int difficulty, time;
	private ArrayList<Ingred> ingredList = new ArrayList<>();
	
	void inputName(String name)
	{
		this.name = name;
	}
	
	void editName()
	{
		
	}
	
	void inputDifficulty(int difficulty)
	{
		this.difficulty = difficulty;
	}
	
	void editDifficulty()
	{
		
	}
	
	void inputTime()
	{
		
	}
	
	void editTime()
	{
		
	}
	
	void addIngred(Ingred newIngred)
	{
		ingredList.add(newIngred);
	}
	
	ArrayList<Ingred> ingredList()
	{
		return ingredList;
	}
	
	void editIngred()
	{
		
	}
	
	void deleteIngred()
	{
		
	}
	
	void inputNote()
	{
		
	}
	
	void editNote()
	{
		
	}
	
	void deleteNote()
	{
		
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(this.name+"\n\n");
		sb.append("Schwierigkeit/Aufwand: "+this.difficulty+"\n\n");
		sb.append("Zutaten: \n");
		for(int i=0; i<ingredList.size() ;i++)
		{
			Ingred ing = ingredList.get(i);
			sb.append(ing);
		}
		return sb.toString();
	}
	
}
