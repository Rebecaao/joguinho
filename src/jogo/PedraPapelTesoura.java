package jogo;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura 
{public static void main(String[] args) {
	
    
	Scanner leitor = new Scanner (System.in);
	Random sorteio = new Random();
	
	int valorUsuario, numpartidas;
	int cont = 0;
	int vitoriasusuario = 0;
	int vitoriascomp = 0;
	String jogarnovamente = "S";
	
	System.out.println("----------------------------");
	System.out.println("      J O K E N P O         ");
	System.out.println("----------------------------");
	
	System.out.print("Quantas partidas: ");
	
	numpartidas = leitor.nextInt();
	
	if (numpartidas % 2 == 0 || numpartidas < 3) {
		System.out.println("N�mero de partidas inserido inv�lido");
	} else {
		while (cont < numpartidas && jogarnovamente.equals("S")) {
			cont = cont + 1;
			System.out.println();
			System.out.println("Partida " + cont);
			
			System.out.println();
			System.out.println("Escolha uma op��o: ");
			System.out.println();
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			
			System.out.print("Digite sua escolha(use apenas os algorismos 1, 2 ou 3: ");
			valorUsuario = leitor.nextInt();
			
			System.out.println();
			
			
			
			int valorsorteio = sorteio.nextInt(numpartidas) + 1;
			
			if (valorUsuario == 1 && valorsorteio == 2) {
				System.out.println("O usu�rio selecionou: " + valorUsuario + "(pedra)"); 
				System.out.println("O computador selecionou: " + valorsorteio + "(papel)"); 
				System.out.println();
				System.out.println("O COMPUTADOR GANHOU!!!");
				vitoriascomp = vitoriascomp + 1;
			} else if (valorUsuario == 1 && valorsorteio == 3) {
				System.out.println("O usu�rio selecionou: " + valorUsuario + "(pedra)");
				System.out.println("O computador selecionou: " + valorsorteio + "(tesoura)");  
				System.out.println();
				System.out.println("O usu�rio ganhou!!!");
				vitoriasusuario = vitoriasusuario + 1;
				if (numpartidas / 2 < vitoriasusuario ) {
					System.out.println("O usuario venceu a melhor de " + numpartidas);
				} else if (numpartidas / 2 < vitoriascomp) {
					System.out.println("O computador venceu a melhor de " + numpartidas);
				}
			} else if (valorUsuario == 2 && valorsorteio == 3) {
				System.out.println("O usu�rio selecionou: " + valorUsuario + "(papel)"); 
				System.out.println("O computador selecionou: " + valorsorteio + "(tesoura)");
				System.out.println();
				System.out.println("O COMPUTADOR GANHOU!!!");
			} else if (valorUsuario == 2 && valorsorteio == 1) {
				System.out.println("O usu�rio selecionou: " + valorUsuario + "(papel)"); 
				System.out.println("O computador selecionou: " + valorsorteio + "(pedra)");
				System.out.println();
				System.out.println("O usu�rio ganhou!!!");
			} else if (valorUsuario == 3 && valorsorteio == 1) {
				System.out.println("O usu�rio selecionou: " + valorUsuario + "(tesoura)"); 
				System.out.println("O computador selecionou: " + valorsorteio + "(pedra)");
				System.out.println();
				System.out.println("O COMPUTADOR GANHOU!!!!");
			} else if (valorUsuario == 3 && valorsorteio == 2) {
				System.out.println("O usu�rio selecionou: " + valorUsuario + "(tesoura)"); 
				System.out.println("O computador selecionou: " + valorsorteio + "(papel)");
				System.out.println();
				System.out.println("O usu�rio ganhou!!!");	
			} else if (valorUsuario == 1 && valorsorteio == 1) {
				System.out.println("O usu�rio selecionou: " + valorUsuario + "(pedra)"); 
			    System.out.println("O computador selecionou: " + valorsorteio + "(pedra)");
			    System.out.println();
			    while (valorUsuario == valorsorteio);
				System.out.println("EMPATE!!!");
			} else if (valorUsuario == 2 && valorsorteio == 2) {
				System.out.println("O usu�rio selecionou: " + valorUsuario + "(pedra)"); 
				System.out.println("O computador selecionou: " + valorsorteio + "(pedra)");
				System.out.println();
				System.out.println("EMPATE!!!");
			
			} else if (valorUsuario == 3 && valorsorteio == 3) {
				System.out.println("O usu�rio selecionou: " + valorUsuario + "(tesoura)"); 
				System.out.println("O computador selecionou: " + valorsorteio + "(tesoura)");
				System.out.println();
				System.out.println("EMPATE!!!");
			}
		
	
	
}

	}
}
}
