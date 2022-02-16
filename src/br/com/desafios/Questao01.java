package br.com.desafios;

public class Questao01 {
	public static void main(String[] args) {
	    int n = 6; // Quantidade degraus da escada
	    String estrelas = "*"; // String de estrelas para a escada
	    String escada = ""; // String para formar a escada
	    
	    for(int i = 0; i < n; i++) {
	        String formatoEscada = String.format("%" + n + "s", estrelas); // Formata��o da linha para formar degrau, n = n�mero de caracteres da linha para deixar espa�o em branco e formar a escada
	        estrelas += "*"; // Adiciona uma estrela a cada degrau formado
	        escada += formatoEscada + "\n"; // Adiciona cada degrau a escada 
	    }
	    
	    System.out.println(escada);
	}
}
