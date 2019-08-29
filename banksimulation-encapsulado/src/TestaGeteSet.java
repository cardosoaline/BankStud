
public class TestaGeteSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		
   // O encapsulamento ajuda a validar na propria classe auxilia
		//na parte de manipular as informações.
		 // conta.setNumero(1334);
		  System.out.println(conta.getNumero());
		  
		  Cliente aline = new Cliente ();
		  
		  //conta.titular=paulo; este processo não pode pois se encontra em private.
		  
		  conta.setTitular(aline);
		  
		  aline.setNome("Aline Lopes"); 
		   
		  
		  conta.getTitular().setProfissao("Programadora");		  
		
		  Cliente titularDaConta = conta.getTitular();
		  titularDaConta.setProfissao("Programadora");
		  
		  System.out.println(titularDaConta);
		  System.out.println(aline);
		  System.out.println(conta.getTitular());
		  
		  
		  
		  
	}
}
