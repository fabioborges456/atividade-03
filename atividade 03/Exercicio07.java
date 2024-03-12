//Ler uma temperatura em graus Celsius e apresentá-la
//convertida em graus Fahrenheit. A fórmula de conversão é
//F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e
//C a temperatura em Celsius.

package lista02;
import java.util.Scanner;
public class Lista02Exercicio01 {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Digite a Temperatura em graus Celsius");
	   float grausCelsius=sc.nextFloat();
	   float grausFahrenheit=(9*grausCelsius+160)/5;
	System.out.println("O valor da temperatura convertida é "+grausFahrenheit+ " F");
sc.close();
}
}

