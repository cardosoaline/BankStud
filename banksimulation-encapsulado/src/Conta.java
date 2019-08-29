
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int numero, int agencia) {
		Conta.total++;
		//System.out.println("O total de contas é: " + Conta.total);
		this.numero = numero;
		this.agencia = agencia;
		//System.out.println("Estou criando uma conta " + numero);
	}

	// void pois não vai devolver resposta.//Metodo Depositar
	public void deposita(double valor) {

		this.saldo += valor;
	}

	// Metodo Sacar
	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Seu saldo atual é R$" + this.saldo + " você acabou de sacar R$" + valor);
			return true;

		} else {
			System.out.println("Saldo insuficiente R$" + this.saldo);
			return false;

		}

	}

	// Metodo Transferir
	public boolean transfere(double valor, Conta destino) {

		if (valor <= this.saldo) {

			this.saldo -= valor;
			destino.saldo += valor;

			return true;

		} else {

			System.out.println("Saldo insuficiente para transferencia!");

			return false;
		}

	}

	public double getSaldo() {

		return this.saldo;
	}

	public int getNumero() {

		return this.numero;

	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Erro! numero não pode ser menor que 0!");
			return;
		}

		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia não pode ser menor que 0!");

			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotatl() {
		return Conta.total;
	}

}
