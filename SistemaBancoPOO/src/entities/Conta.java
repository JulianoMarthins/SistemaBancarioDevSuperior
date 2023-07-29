package entities;

public class Conta {

	// Atributos
	private int numConta;
	private String nome;
	private double saldo;

	// Contrutores
	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;

	}

	// Metodos de classe
	public void deposito(double valor) {
		this.saldo += valor;
	}

	public void saque(double valor) {
		this.saldo -= valor + 5.0;
	}

	// toString

	public String toString() {
		return String.format("\nNúmero da conta: %d%nTitular: %s%nSaldo: %.2f%n", this.numConta, this.nome,
				this.getSaldo());

	}

	// Getters & Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

}
