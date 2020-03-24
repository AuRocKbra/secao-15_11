package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Conta;
import model.excecao.ConjuntoDeExeption;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Número da conta:");
			int numeroDaConta = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome do proprietário:");
			String nome = sc.nextLine();
			System.out.println("Saldo da conta:");
			Double saldo = sc.nextDouble();
			System.out.println("Limite de saque:");
			Double limiteDeSaque = sc.nextDouble();
			Conta conta = new Conta(numeroDaConta,nome,saldo,limiteDeSaque);
			System.out.println("Valor saque:R$");
			conta.saque(sc.nextDouble());
			System.out.println("\nExtrato:\nNumero da conta: "+conta.getNumeroDaConta()+"\nSaldo:R$"+String.format("%.2f",conta.getSaldo()));
		}catch (ConjuntoDeExeption e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("Formato do dado infomado inválido!");
		}
		finally {
			sc.close();
		}
		
	}

}
