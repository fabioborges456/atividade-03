/*
* 5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
* Fahrenheit. A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura
* em Fahrenheit e C a temperatura em Celsius
*/

package tarefa03deLinguagemdeProgramaçãoJava;
import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Digite a temperatura em graus Fahrenheit : ");
	   float celsius = sc.nextFloat();
	   float fahrenheit = (9 * celsius + 160) / 5;
	System.out.println("A temperatura em Celsius convertida em Fahrenheit é : " + fahrenheit);
sc.close();
	}
}
