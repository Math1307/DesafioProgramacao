package br.com.desafios;

import java.util.ArrayList;
import java.util.List;

public class Questao03 {

	public static void main(String[] args) {
		String palavra = "ovo"; // Palavra para verifica��o
		char[] letrasPalavra = palavra.toCharArray(); // Transforma a palavra em um Array de caracteres
		List<List<Integer>> indexsIguais = new ArrayList<List<Integer>>(); // Array de Array de n�meros para salver index correspondentes
		
		for (int i = 0; i < letrasPalavra.length; i++) {
			List<Integer> indexIgual = new ArrayList<Integer>(); // Array de n�meros para salvar index iguais
			for(int j = i + 1; j < letrasPalavra.length; j++) {
				if(letrasPalavra[i] == letrasPalavra[j]) { // Verifica se os caracteres nos respectivos index s�o iguais
					if(i != j) { // Verifica se o index n�o � o mesmo
						indexIgual.add(i); // Salva o primeiro index
						indexIgual.add(j); // Salva o segundo index
					}
				}
			}
			if(indexIgual.size() > 0) { // Verifica se o Array de n�meros n�o est� vazio
				indexsIguais.add(indexIgual); // Salva o Array de n�meros no Array de Array de N�meros
			}
		}

		System.out.println(indexsIguais);
	}
}
