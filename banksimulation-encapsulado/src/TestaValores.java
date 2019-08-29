
public class TestaValores {
	
	public static void main(String[] args) {
		
		
		Conta conta = new Conta(1337,1425);
		Conta conta2 = new Conta(1337,1526);
		Conta conta3 = new Conta(1337,1526);

		
		
		//Criando Construtores e eliminando alguns get e set
		//Conta Inconsistente
		//conta.setAgencia(-50);
	//	conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("Total de contas criadas "+Conta.getTotatl());
		
		
	}

}
