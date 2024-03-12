/*
* 9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso,
* utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
*/

import java.util.Scanner;

public class Exercicio09 {
public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor da prestação");
       int valor = sc.nextInt();
    System.out.println("Digite o valor da taxa");
       int taxa = sc.nextInt();
    System.out.println("digite o tempo");
       int tempo = sc.nextInt();
    System.out.println ("O valor da prestação em atraso é de " + valor*taxa/100*tempo);

sc.close();
}
}