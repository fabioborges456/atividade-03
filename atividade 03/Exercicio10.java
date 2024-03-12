/*
* 10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B,
* e efetuar a troca dos valores de forma que a variável A passe a possuir o
* valor da variável B e a variável B passe a possuir o valor da variável A.
* Apresentar os valores trocados.
*/

package tarefa03deLinguagemdeProgramaçãoJava;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Digite o Valor A: ");
	   float valorA = sc.nextFloat();
	System.out.println("Digite o Valor B: ");
	   float valorB = sc.nextFloat();
	   float rA = valorB;
	   float rB = valorA;
	System.out.println("O Valor A: "+rA+" e o Valor B: "+rB);
		
sc.close();
	}
}
