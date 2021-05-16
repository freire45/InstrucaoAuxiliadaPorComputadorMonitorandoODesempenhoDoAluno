package br.com.erickfreire.instrucaoauxiliadaporcomputador;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Programa em Java que ajuda um aluno a aprender multiplica��o
 * 
 * @author Erick Freire
 * @version 1 - Criado em 16-05-2021 as 14:42
 */

public class InstrucaoAuxiliadaPorComputadorAluno {
	
	public static double acertou = 0.0;
	public static double errou = 0.0;

	public static void main(String[] args) {
		System.out.println("Programa que ajuda aprender multiplica��o");
		
		for(int i = 1; i <= 10; i++) {
			multiplicacao();
		}
		
		
		double resultado = ((acertou / 10) - (errou /10)) * 100;
		
		if(resultado < 75.0) {
			System.out.println("\nPe�a Ajuda ao seu professor, sua m�dia foi de: " + resultado);
		} else {
			System.out.println("\nParab�ns - Sua M�dia foi de: " + resultado);
		}

	}

	public static void multiplicacao() {

		int numero1;
		int numero2;
		int multiplicacao;
		int resposta;
		int correta;
		int incorreta;

		SecureRandom numeroAleatorio = new SecureRandom();
		Scanner entrada = new Scanner(System.in);

		numero1 = numeroAleatorio.nextInt(10);
		numero2 = numeroAleatorio.nextInt(10);
		multiplicacao = numero1 * numero2;

		System.out.printf("%nQuanto � %d * %d ?%n", numero1, numero2);
		resposta = entrada.nextInt();

		if (resposta == multiplicacao) {
			correta = 1 + numeroAleatorio.nextInt(4);

			switch (correta) {
			case 1:
				System.out.println("Muito Bom!");
				break;
			case 2:
				System.out.println("Excelente!");
				break;
			case 3:
				System.out.println("Bom Trabalho!");
				break;
			case 4:
				System.out.println("Mantenha um bom trabalho!");
				break;
			default:
				System.out.println("Muito Bem!");
				break;
			}
			acertou++;
		} else {
			while (resposta != multiplicacao) {
				incorreta = 1 + numeroAleatorio.nextInt(4);

				switch (incorreta) {
				case 1:
					System.out.println("N�o, por favor tente de novo");
					break;
				case 2:
					System.out.println("Errado. Tente mais uma vez.");
					break;
				case 3:
					System.out.println("N�o desista!");
					break;
				case 4:
					System.out.println("N�o. Continue tentando.");
					break;
				default:
					System.out.println("Errado!");
					break;
				}
				
				errou++;
				System.out.printf("%nResposta Incorreta! Tente de novo! Quanto � %d * %d ?%n", numero1, numero2);
				resposta = entrada.nextInt();
			}
			acertou++;
			System.out.println("Muito Bem!");
		}
	}

}
