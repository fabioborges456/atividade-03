/*
 * 1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
 * dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
 * com 365 dias e mês com 30 dias.
 */

package tarefa03deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] Args) {
	   Scanner sc = new Scanner(System.in);
	System.out.println("Digite quantos anos completo voce possui : ");
	   int ano = sc.nextInt();
	System.out.println("Digite a quantidade de meses completos vividos : ");
	   int meses = sc.nextInt();
	System.out.println("Digite a quantidade de dias passados do meu ultimo mês versario : ");
	   int dias = sc.nextInt();
	   int diasVividos = ano * 365 + meses * 30 + dias;
	System.out.println("A quantidade de dias vividos corresponde a : " + diasVividos);

sc.close();
	}
}
