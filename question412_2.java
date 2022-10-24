package List2;
import java.lang.*;

class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(double valor) {
        super("Saldo insuficiente para sacar o valor de: " + valor);
    }
}
class conta{
	String titular,agencia;
	int numero;
	double saldo;
	data dataDeAbertura;
	
	void saque(double valor) {
		 if (valor < 0) {
		        throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		    }
		    if (this.saldo < valor) {
		        throw new SaldoInsuficienteException(valor);
		    }
		    this.saldo -= (valor + 0.10);
	}
	
	void deposito(double valor) {
		if (valor < 0) {	
	        throw new IllegalArgumentException("Você tentou depositar um valor negativo");
	    } else {
	        this.saldo += valor;        
	    }       
	}
	void calculaRendimento() {
		return this.saldo*0.1;
	}
	void recuperaDadosParaImpressao() {

		System.out.println("Conta: " + this.numero + " - " + this.agencia + "\n" +
				   "Data de abertura: " + this.dataDeAbertura.formatada() + "\n" +
				   "Titular: "+ this.titular +
				   "Saldo: " + this.saldo);
	}
}
class data{
	int dia, mes, ano;
	
	void preencher(int dia, int mes, int ano) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	String formatada() {

		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
public class question412_2 {
	public static void main(String[] args) {
		conta teste = new conta();
		
		teste.titular="Gessyca";
		teste.numero=194300031;
		teste.agencia="ufsj";
		teste.saldo=2019.1;
		
		teste.dataDeAbertura = new data();
		teste.dataDeAbertura.preencher(7, 2, 2019);

		//teste.saque(30000);
		//teste.saque(-30000);
		teste.deposito(-30000);
		
	}
}

