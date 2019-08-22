
public class Conta {
	
    private	double saldo ;
	private int agencia  ;
	private int numero;
	private Cliente titular ;
	
	
	
	//void pois não vai devolver resposta.//Metodo Depositar
	public void deposita(double valor) {
		
		this.saldo += valor;
	}
	
	
	//Metodo Sacar
	public boolean saca(double valor) {
		
	if ( this.saldo >= valor) {		
		this.saldo -= valor;
		System.out.println("Seu saldo atual é R$"+this.saldo+ " você acabou de sacar R$" + valor);
		return true;
		
	}else {
		System.out.println("Saldo insuficiente R$"+this.saldo);
		return false;
		
	    }			
		
	}
	
	
	//Metodo Transferir
	 public boolean transfere(double valor,Conta destino) {
		 
		 if(valor <= this.saldo) {
			 
			 this.saldo -= valor ;
			 destino.saldo += valor;
			 
			 
			 return true;
			 
		 }else {
			 
			 System.out.println("Saldo insuficiente para transferencia!");

			 return false;
		 }
		 
	 }
	 
	 public double getSaldo() {
		 
		 return this.saldo;
	 }
	 
	 public int getNumero() {
		 
		 return this.numero;
		 
	 }
	 
	 public int setNumero (int numero) {
		 
		 return this.numero = numero;
	 }

	 public int getAgencia() {
		return agencia;
	}
	 
	 public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}


