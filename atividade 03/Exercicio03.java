/*
* 3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o
* percentual de reajuste. Calcular e escrever o valor do novo salário.
*/
package tarefa03deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] Args) {
Scanner sc = new Scanner(System.in);
	System.out.println("Digite o Salario atual do Funcionario : ");
	   float salarioAtual = sc.nextFloat();
	System.out.println("Digite o Percentual do Reajuste : ");
	   float reajustoPercentual = sc.nextFloat();
	   float novoSalario = (salarioAtual / 100) * reajustoPercentual;
	   float soma = novoSalario + salarioAtual;
	System.out.println("O valor do Novo Salario com o reajuste é " + soma);

sc.close();
	}
}
