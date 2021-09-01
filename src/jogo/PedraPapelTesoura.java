package jogo;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura 
{public static void main(String[] args) {
	
    
	Scanner leitor = new Scanner (System.in);
	Random sorteio = new Random();
	
	int valorSorteado = sorteio.nextInt(3) + 1;
	int v1;
	
	System.out.println("**************************");
	System.out.println("Escolha uma opção: ");
	System.out.println("**************************");
	System.out.println("1-Pedra");
	System.out.println("2-Papel");
	System.out.println("3-Tesoura");
	System.out.println("**************************");
	
	System.out.println("Qual a sua escolha? ");
	 v1 = leitor.nextInt();
	
	System.out.println(valorSorteado);
	valorSorteado = sorteio.nextInt();
	
	leitor.close();
	
	if (valorSorteado == 1) {
		if (v1 == 1) {
			System.out.println("você escolheu pedra");
			System.out.println("pc escolheu pedra");
			System.out.println("EMPATE!!");
		} else if (valorSorteado == 2) {
			System.out.println("você escolheu pedra");
			System.out.println("pc escolheu papel");
			System.out.println("VOCÊ VENCEU!!");
		} else {
			System.out.println("você escolheu pedra");
			System.out.println("pc escolheu tesoura");
			System.out.println("PC VENCEU");
		}
	} else if (valorSorteado == 2) {
		if (v1 == 2) {
			System.out.println("você escolheu papel");
			System.out.println("pc escolheu papel");
			System.out.println("EMPATE!!");
		}else if (valorSorteado == 1) {
			System.out.println("você escolheu papel");
			System.out.println("pc escolheu pedra");
			System.out.println("VOCÊ VENCEU!!");
		} else {
			System.out.println("você escolheu papel");
			System.out.println("pc escolheu tesoura");
			System.out.println("PC VENCEU!!");
		}
	} else {
		if (v1 == 3) {
			System.out.println("você escolheu tesoura");
			System.out.println("pc escolheu tesoura");
			System.out.println("EMPATE!!");
		} else if (valorSorteado == 1) {
			System.out.println("você escolheu tesoura");
			System.out.println("pc escolheu pedra");
			System.out.println("PC VENCEU!!");
		} else {
			System.out.println("você escolheu tesoura");
			System.out.println("você escolheu pedra");
			System.out.println("VOCÊ VENCEU!!");
		}
	}
	
	
}

}
