package br.com.desafios;

public class Questao01 {
	public static void main(String[] args) {
	    int n = 6; // Quantidade degraus da escada
	    String estrelas = "*"; // String de estrelas para a escada
	    String escada = ""; // String para formar a escada
	    
	    for(int i = 0; i < n; i++) {
	        String formatoEscada = String.format("%" + n + "s", estrelas); // Formatação da linha para formar degrau, n = número de caracteres da linha para deixar espaço em branco e formar a escada
	        estrelas += "*"; // Adiciona uma estrela a cada degrau formado
	        escada += formatoEscada + "\n"; // Adiciona cada degrau a escada 
	    }
	    
	    System.out.println(escada);
	}
}
