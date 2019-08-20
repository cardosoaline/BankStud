
public class TestesReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: R$"+ primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;//Ele vai pegar a Referencia.		
		System.out.println("Saldo da Segunda conta: R$"+segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("O Saldo da segunda conta �: R$"+ segundaConta.saldo);//Ele altera a primeira conta tamb�m
		//pois est�o apontando para a mesma conta.
		System.out.println("Saldo da primeira conta: R$"+ primeiraConta.saldo);
		
		
		//Igual == vai comparar as referencias.OBS:Testes Realizado na classe CriaConta.
		if (primeiraConta == segundaConta) {
			
			System.out.println("S�o contas iguais!");  
		} else {
			
			System.out.println("S�o contas diferentes");
		}
		
	}

}
