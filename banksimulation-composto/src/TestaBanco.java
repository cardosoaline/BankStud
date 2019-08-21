
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente aline = new Cliente();
		
		
		aline.nome = "Aline Lopes";
		aline.cpf = "296.236.236.XX";
		aline.profissao = "Programadora";
		
		Conta contaAline = new Conta();
		contaAline.deposita(100);
		
		//Associa a conta da Aline a cliente Aline
		contaAline.titular = aline;
		System.out.println(contaAline.titular.nome);
		
	}

}
