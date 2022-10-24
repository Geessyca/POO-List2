package List2;
//question412_2
 
class InsufficientFunds extends RuntimeException {

    public InsufficientFunds(double valor) {
        super("Saldo insuficiente para sacar o valor de: " + valor);
    }
}
class BankAccount{
	String holder,bankBranch;
	int number;
	double balance;
	Date openingDate;
	
	void withdrawal(double valor) {
		 if (valor < 0) {
		        throw new IllegalArgumentException("Voc� tentou sacar um valor negativo");
		    }
		    if (this.balance < valor) {
		        throw new InsufficientFunds(valor);
		    }
		    this.balance -= (valor + 0.10);
	}
	
	void deposit(double valor) {
		if (valor < 0) {	
	        throw new IllegalArgumentException("Voc� tentou depositar um valor negativo");
	    } else {
	        this.balance += valor;        
	    }       
	}
	double calculationIncome() {
		return this.balance*0.1;
	}
	void showBankAccountInfo() {

		System.out.println("Conta: " + this.number + " - " + this.bankBranch + "\n" +
				   "Data de abertura: " + this.openingDate.formatDate() + "\n" +
				   "Titular: "+ this.holder +
				   "Saldo: " + this.balance);
	}
}
class Date{
	int day, month, year;
	
	void fillDate(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	String formatDate() {

		return this.day + "/" + this.month + "/" + this.year;
	}
}
public class CreatBankAccount {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		
		bankAccount.holder="Gessyca";
		bankAccount.number=194300031;
		bankAccount.bankBranch="ufsj";
		bankAccount.balance=2019.1;
		
		bankAccount.openingDate = new Date();
		bankAccount.openingDate.fillDate(7, 2, 2019);

		//bankAccount.withdrawal(30000);
		//bankAccount.withdrawal(-30000);
		bankAccount.deposit(30000);
		bankAccount.showBankAccountInfo();
	}
}

