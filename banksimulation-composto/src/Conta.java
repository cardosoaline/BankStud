
public class Conta {
	
    private	double saldo ;
	int agencia  ;
	int numero;
	Cliente titular ;
	
	
	
	//void pois n�o vai devolver resposta.//Metodo Depositar
	public void deposita(double valor) {
		
		this.saldo += valor;
	}
	
	
	//Metodo Sacar
	public boolean saca(double valor) {
		
	if ( this.saldo >= valor) {		
		this.saldo -= valor;
		System.out.println("Seu saldo atual � R$"+this.saldo+ " voc� acabou de sacar R$" + valor);
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

}


