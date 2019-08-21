
public class TesteSacaNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(10);
		
		// System.out.println(conta.saldo);
		
		
		//Proibido Deixar conta negativa - Estudando parte de security encapsulamento ou private.
		//conta.saldo  = conta.saldo - 101;
	//	System.out.println(conta.saldo );
		
		System.out.println(conta.getSaldo());

	}

}
