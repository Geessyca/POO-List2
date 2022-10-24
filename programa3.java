package List2;

class casa{
	boolean porta1, porta2, porta3;
	String cor;
	
	void pinta(String s) {
		this.cor = s;
	}
	int	quantasPortasEstaoAbertas(boolean porta1, boolean porta2,boolean porta3) {
		int quantidade=0;
		if (porta1==true) {
			quantidade=quantidade+1;
		}
		if (porta2==true) {
			quantidade=quantidade+1;
		}
		if (porta3==true) {
			quantidade=quantidade+1;
		}
		
		return quantidade;
	}
}
public class programa3 {
	public static void main(String[] args) {
		casa Casa = new casa();
		Casa.cor="Azul";
		Casa.porta1=true;
		Casa.porta2=false;
		Casa.porta3=true;
		
		System.out.println("\nSua cor é " + Casa.cor +
						   "\nE tem " + Casa.quantasPortasEstaoAbertas(Casa.porta1, Casa.porta2, Casa.porta3) +
						   " portas abertas!");
		
		Casa.cor="Rosa";
		Casa.porta1=true;
		Casa.porta2=false;
		Casa.porta3=false;
		
		System.out.println("\nSua cor é " + Casa.cor +
						   "\nE tem " + Casa.quantasPortasEstaoAbertas(Casa.porta1, Casa.porta2, Casa.porta3) +
						   " portas abertas!");
		
	}
}

