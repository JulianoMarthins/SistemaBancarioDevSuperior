package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("----------Sistema bancário----------\n");
		System.out.println("----------Cadastro de cliente----------\n");
		System.out.println("Insira o número da conta: ");
		int num = sc.nextInt();
		sc.nextLine(); // Consome linha pendente da linha acima
		System.out.println("Informe o nome do titular: ");
		String nome = sc.nextLine();

		Conta conta = new Conta(num, nome);

		System.out.println("Deseja realizar deposito inicial? \n[S -> Sim N -> Não]");
		char op = sc.next().charAt(0);

		
		double valor = 0;
		while (true){
			
			if (op == 's' || op == 'S') {
				System.out.println("Digite o valor de deposito: ");
				valor = sc.nextDouble();
				conta.deposito(valor);
				System.out.println("------------------------------");
				System.out.println("\nConta aberta com sucesso\n" + conta.toString());
				System.out.println("------------------------------");
				break;
				
			} else if ( op == 'n' || op == 'N'){
				System.out.println("------------------------------");
				System.out.println("Conta aberta com Sucesso\n" + conta.toString());
				System.out.println("------------------------------");
				break;
				
			} else {
				System.out.println("------------------------------");
				System.out.println("Valor inválido, digite: [S -> Sim N -> Não]");
				System.out.println("------------------------------");
				op = sc.next().charAt(0);
			}
		}

		System.out.println("Digite o valor de depoisto: ");
		valor = sc.nextDouble();
		conta.deposito(valor);
		System.out.println("Deposito realizado com sucesso\n" + conta.toString());

		System.out.println("Digite o valor de saque: ");
		valor = sc.nextDouble();
		conta.saque(valor);
		System.out.println("Saque realizado com sucesso\n" + conta.toString());

		sc.close();

	}

}
