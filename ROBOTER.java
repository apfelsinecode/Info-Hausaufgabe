import javakarol.Roboter;


public class ROBOTER extends Roboter {

	public ROBOTER(int startX, int startY, char startBlickrichtung, WELT inWelt)
	{
		super(startX, startY, startBlickrichtung, inWelt);
	}
	
	public ROBOTER(WELT inWelt)
	{
		super(inWelt);
	}
	
	
	/**
	 * Der Roboter macht einen Schritt nach vorne
	 */
	public void Schritt()
	{
		super.Schritt();
	}
	
	
	/**
	 * Der Roboter dreht sich nach Links (gegen den Uhrzeigersinn)
	 */
	public void LinksDrehen()
	{
		super.LinksDrehen();
	}
	
	
	/**
	 * Der Roboter dreht sich nach Rechts (im Uhrzeigersinn)
	 */	
	public void RechtsDrehen()
	{
		super.RechtsDrehen();
	}
	
	
	/**
	 * Der Roboter legt vor sich einen Ziegel hin
	 */
	public void Hinlegen()
	{
		super.Hinlegen();
	}
	
	
	/**
	 * Der Roboter hebt vor sich einen Ziegel auf
	 */
	public void Aufheben()
	{
		super.Aufheben();
	}
	
	
	/**
	 * Der Roboter setzt auf der Kachel unter ihm eine Marke
	 */
	public void MarkeSetzen()
	{
		super.MarkeSetzen();
	}
	
	
	/**
	 * Der Roboter entfernt von der Kachel unter ihm eine Marke
	 */	
	public void MarkeLoeschen()
	{
		super.MarkeLoeschen();
	}
	
	
	/**
	 * Der Roboter gibt einen Piep-Ton aus
	 */
	public void TonErzeugen()
	{
		super.TonErzeugen();
	}
	
	
	/**
	 * Abfrage ob der Roboter vor einer Wand bzw. einem Quader steht
	 * 
	 * @return wenn zutrifft dann true
	 */
	public boolean IstWand()
	{
		return super.IstWand();
	}
	
	
	/**
	 * Abfrage ob vor dem Roboter ein Ziegel liegt
	 * 
	 * @return wenn zutrifft dann true
	 */
	public boolean IstZiegel()
	{
		return super.IstZiegel();
	}
	
	
	/**
	 * Abfrage ob sich unter dem Roboter eine Marke befindet
	 * 
	 * @return wenn zutrifft dann true
	 */
	public boolean IstMarke()
	{
		return super.IstMarke();
	}
	

}
