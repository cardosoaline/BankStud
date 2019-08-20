
public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.saldo = 200;		
		primeiraConta.saldo += 100;		
		
		segundaConta.saldo = 50;
		
		
		System.out.println("A primeira conta está com saldo de: R$"+ primeiraConta.saldo);
		System.out.println(" A segunda conta está com saldo atual de: R$"+segundaConta.saldo);
		

	}

}
