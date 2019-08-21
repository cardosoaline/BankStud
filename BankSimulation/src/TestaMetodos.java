
public class TestaMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta contaAline = new Conta();		
		contaAline.saldo = 15;	
		
    	//Metodo depositar.
		contaAline.deposita(50);
		
        //Metodo Sacar.
		contaAline.saca(10);
		
		Conta contaLuiza = new Conta();
		contaLuiza.saldo = 1000;
		
	    //Metodo de transferencia.
		contaLuiza.transfere(200, contaAline);
		System.out.println("Saldo da conta da Luiza R$"+contaLuiza.saldo);
		System.out.println("Saldo da conta da Aline R$"+contaAline.saldo);
		
		contaAline.titular = "Aline Lopes";
		System.out.println(contaAline.titular);
	}
	
	   
	
}