
public class mainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frazione f1 = new Frazione(1,2);
		Frazione f2 = new Frazione(7);
		Frazione f0 = new Frazione("23","43");
		Frazione f3 = new Frazione("23/43");
		System.out.println("Il risultato della divisione �: "+f3.divisione());
		System.out.println("Il risultato della divisione �: "+f3.toString());
		Frazione fSomma = f1.Somma(new Frazione("1/3"));
		System.out.println("Il risultato della somma �: "+fSomma.toString());
	}

}
