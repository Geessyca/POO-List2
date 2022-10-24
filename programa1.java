package List2;

class pessoa{
	String nome;
	int idade;
	
	void fazAniversario(int i) {
		int newIdade = this.idade+i;
		System.out.println(this.nome + " tem " + newIdade);
	}
}
public class programa1 {
	public static void main(String[] args) {
		pessoa teste = new pessoa();
		
		teste.nome="Gessyca";
		teste.idade=21;
		
		for (int i=1;i<5;i++) {
			teste.fazAniversario(i);
		}
	}
}

