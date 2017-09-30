
public class Ingred
{
	String name;
	int menge;
	MeasureDE einheit;
	
	Ingred(String name, MeasureDE einheit)
	{
		this.name = name;
		this.einheit = einheit;
	}
	
	public enum MeasureDE
	{
		Gramm, Pfund, Kilogramm, Mililiter, Liter, Tropfen, Spritzer, Schuss, Prise, Messerspitze, Teelöffel, Esslöffel, Tasse, Stück, Unknown 
	}
//	private enum MeasureGB
//	{
//		gram, pound, kilogram, mililiter, liter, fluidOunce, drop, dash, pinch, saltspoon, teaspoon, tablespoon, teacup, cup, piece 
//	}
//	private enum MeasureUS
//	{
//		grain, ounce, pound, fluidOunce, drop, dash, pinch, pint, quart, gallon, teaspoon, tablespoon, cup, piece 
//	}
	
	static MeasureDE strToMeasure(String einheit)
	{
		einheit.toLowerCase().trim();
		if(einheit.equals("gramm"))
			return MeasureDE.Gramm;
		else if(einheit.equals("pfund"))
			return MeasureDE.Pfund;
		else
			return MeasureDE.Unknown;
	}
	
	void inputName()
	{
		
	}
	
	void editName()
	{
		
	}
	
	void convert()
	{
		
	}
	
	void chooseMeasurement()
	{
		
	}
	
	public String toString()
	{
		return new String(einheit+" "+name);
	}
}
