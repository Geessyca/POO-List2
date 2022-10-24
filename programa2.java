package List2;

class porta{
	boolean aberta;
	double dimensaoX, dimensaoY, dimensaoZ;
	String cor;
	
	void abre() {
		this.aberta = true;
	}
	void fecha() {
		this.aberta = false;
	}
	void tamanho(double dimensaoX, double dimensaoY, double dimensaoZ) {
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}
	void pinta(String s) {
		this.cor = s;
	}
	boolean	estaAberta() {
		return this.aberta;
	}
}
public class programa2 {
	public static void main(String[] args) {
		porta Porta = new porta();
		Porta.aberta=false;
		Porta.dimensaoX=0.6;
		Porta.dimensaoY=1.2;
		Porta.dimensaoZ=0.15;
		Porta.cor="Preta";
		String status;
		
		if (Porta.estaAberta() == true) {
			status = "Sim est� aberta!";
		}
		else {
			status = "N�o est� aberta!";
		}
		
		System.out.println(status + 
						   "\nSua cor � " + Porta.cor +
						   "\nSua Dimens�o � " + Porta.dimensaoX + " X "+
							Porta.dimensaoY + " X "+ Porta.dimensaoZ);
		
		Porta.abre();
		Porta.pinta("Rosa");
		Porta.tamanho(1, 3, 0.15);
		
		if (Porta.estaAberta() == true) {
			status = "Sim est� aberta!";
		}
		else {
			status = "N�o est� aberta!";
		}
		
		System.out.println(status + 
				   "\nSua cor � " + Porta.cor +
				   "\nSua Dimens�o � " + Porta.dimensaoX + " X "+
					Porta.dimensaoY + " X "+ Porta.dimensaoZ);
		
	}
}

