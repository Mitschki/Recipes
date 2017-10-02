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
	
	void inputTime(int time)
	{
		this.time = time;
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
	
	void inputNote(String note)
	{
		this.note = note;
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
		sb.append("Schwierigkeitsgrad: "+this.difficulty+"\n");
		sb.append("Zeitaufwand: "+this.time+" Minuten\n\n");
		sb.append("Zutaten: \n");
		for(int i=0; i<ingredList.size() ;i++)
		{
			Ingred ing = ingredList.get(i);
			sb.append(ing+"\n");
		}
		sb.append("\n");
		sb.append("Notizen: "+"\n"+this.note);
		return sb.toString();
	}
	
}
