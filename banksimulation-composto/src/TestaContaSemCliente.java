
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaLuiza = new Conta();
		System.out.println(contaLuiza.getSaldo());
		
		contaLuiza.titular = new Cliente();
		System.out.println(contaLuiza.titular);
		
		contaLuiza.titular.nome = "Luiza Mendes";
		System.out.println(contaLuiza.titular.nome);
	}

}
