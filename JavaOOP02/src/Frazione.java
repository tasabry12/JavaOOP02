
public class Frazione {
	private int numeratore=0;
	private int denominatore=1;

	
	
	public Frazione(int _numeratore, int _denominatore) {
		// TODO Auto-generated constructor stub
		setNumeratore(_numeratore);
		setDenominatore(_denominatore);		
	}
	
	public Frazione(int _numeratore) {
		// TODO Auto-generated constructor stub
		this(_numeratore,1); 
	}
	
	public Frazione(String _numeratore, String _denominatore) {
		// TODO Auto-generated constructor stub
		this(Integer.parseInt(_numeratore),Integer.parseInt(_denominatore));	
	}
	
	public Frazione(String f) {

		this(Integer.parseInt(f.split("/")[0]),
			 Integer.parseInt(f.split("/")[1]));
	}

	//NUMERATORE
	public int getNumeratore() {
		return numeratore;
	}

	public void setNumeratore(int numeratore) {
		this.numeratore = numeratore;
	}
	
	
	//DENOMINATORE
	public int getDenominatore() {
		return denominatore;
	}

	public void setDenominatore(int denominatore) {
		this.denominatore = denominatore;
	}
	
	public int divisione(){
		return (numeratore/denominatore);
	}
	
	  public Frazione Somma(Frazione altra)
	    {
	    	
	    	return new Frazione(numeratore*altra.denominatore + denominatore*altra.numeratore, denominatore*altra.denominatore);
	    	
	    }
	
	public String toString(){
		return (numeratore+"/"+denominatore);
	}


}
