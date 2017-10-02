
public class Ingred
{
	String name;
	int menge;
	MeasureDE einheit;
	
	Ingred(int menge, String name, MeasureDE einheit)
	{
		this.menge = menge;
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
		einheit=einheit.toLowerCase().trim();
		if(einheit.equals("gramm"))
			return MeasureDE.Gramm;
		else if(einheit.equals("pfund"))
			return MeasureDE.Pfund;
		else if(einheit.equals("kilogramm"))
			return MeasureDE.Kilogramm;
		else if(einheit.equals("mililiter"))
			return MeasureDE.Mililiter;
		else if(einheit.equals("liter"))
			return MeasureDE.Liter;
		else if(einheit.equals("tropfen"))
			return MeasureDE.Tropfen;
		else if(einheit.equals("spritzer"))
			return MeasureDE.Spritzer;
		else if(einheit.equals("schuss"))
			return MeasureDE.Schuss;
		else if(einheit.equals("prise"))
			return MeasureDE.Prise;
		else if(einheit.equals("messerspitze"))
			return MeasureDE.Messerspitze;
		else if(einheit.equals("teelöffel"))
			return MeasureDE.Teelöffel;
		else if(einheit.equals("esslöffel"))
			return MeasureDE.Esslöffel;
		else if(einheit.equals("tasse"))
			return MeasureDE.Tasse;
		else if(einheit.equals("stück"))
			return MeasureDE.Stück;
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
		return new String(menge+" "+einheit+" "+name);
	}
}
