
public class CriaConta {

	public static void main(String[] args) {
				
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.saldo = 200;		
		primeiraConta.saldo += 100;		
		
		segundaConta.saldo = 50;
		
		
		System.out.println("A primeira conta est� com saldo de: R$"+ primeiraConta.saldo);
		System.out.println(" A segunda conta est� com saldo atual de: R$"+segundaConta.saldo);
		

		
	if (primeiraConta == segundaConta) {
			
			System.out.println("S�o contas iguais!");  
		}else {
			
			System.out.println("S�o contas diferentes!");
		}
	}

}
