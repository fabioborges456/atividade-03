/*
* 4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
* porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
* Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
* escrever um algoritmo para ler o custo de fábrica de um carro, calcular e
* escrever o custo final ao consumidor.
*/


package tarefa03deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio04 {


	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Digite o Custo de Frabricação do Automovel: ");
	   float custoAutomovel = sc.nextFloat();
	   float distribuidoraPorcentagem = (custoAutomovel / 100) * 28;
	   float impostoPorcentagem = (custoAutomovel / 100) * 45;
	   float valorFiinalConsumidor = (distribuidoraPorcentagem + impostoPorcentagem) + custoAutomovel;
	System.out.println("O custo Final ao Consumidor é : " + valorFiinalConsumidor);

sc.close();
	}
}
