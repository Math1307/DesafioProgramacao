package br.com.desafios;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Leitor de teclado no console
		boolean senhaInvalida = true;
		do {
			
			System.out.println("Digite uma senha:");
			String entradaSenha = scanner.nextLine(); // Lê o que foi digitado e coloca na string

			if(entradaSenha.length() >= 6) { // Verifica se a senha digitada possue mais de 6 digitos
				char[] caracteresSenha = entradaSenha.toCharArray(); // Transforma a senha em um Array de caracteres
				boolean temNumeros = false, temLetras = false, temCaracteresEspeciais = false; // Variáveis para verificar se possue tudo necessário para uma senha válida
				int quantidadeNumeros = 0, quantidadeLetras = 0, quantidadeCaracteresEspeciais = 0; // Variáveis para verificar a quantidade de cada tipo de caractere
				
				for (char caractere: caracteresSenha) {
					if(Character.isDigit(caractere)) { // Verifica se o caractere é um número 
						temNumeros = true;
						quantidadeNumeros++;
					} else if(Character.isLetter(caractere)) { // Verifica se o caractere é uma letra
						temLetras = true;
						quantidadeLetras++;
					} else { // Se o caractere não é uma letra e nem um número é identificado como caractere especial
						temCaracteresEspeciais = true;
						quantidadeCaracteresEspeciais++;
					}
				}
				if(!entradaSenha.toUpperCase().equals(entradaSenha)) { // Verifica se as letras não estão todas em minúsculo
					if(!entradaSenha.toLowerCase().equals(entradaSenha)) { // Verifica se as letras não estão todas em maiúsculo
						if(temNumeros && quantidadeNumeros == entradaSenha.length()) { // Verifica se tem números e se a quantidade de números é a mesma quantidade de caracteres totais na senha
							System.out.println("Sua senha não deve conter somente números, insira letras e caracteres especiais como: !@#$%^&*()-+");
							System.exit(0);
						} else if (temLetras && quantidadeLetras == entradaSenha.length()) { // Verifica se tem letras e se a quantidade de letras é a mesma quantidade de caracteres totais na senha
							System.out.println("Sua senha não deve conter somente letras, insira números e caracteres especiais como: !@#$%^&*()-+");
							System.exit(0);
						} else if (temCaracteresEspeciais && quantidadeCaracteresEspeciais == entradaSenha.length()) { // Verifica se tem caracteres especiais e se a quantidade de caracteres especiais é a mesma quantidade de caracteres totais na senha
							System.out.println("Sua senha não deve conter somente caracteres especiais, insira números e letras.");
							System.exit(0);
						} else {
							if(temNumeros && temLetras && !temCaracteresEspeciais) { // Verifica se faltam caracteres especiais na senha
								System.out.println("Sua senha deve conter caracteres especiais como: !@#$%^&*()-+");
							} else if(temLetras && temCaracteresEspeciais && !temNumeros) { // Verifica se faltam números na senha
								System.out.println("Sua senha deve conter números.");
							} else if(temNumeros && temCaracteresEspeciais && !temLetras) { // Verifica se faltam letras na senha
								System.out.println("Sua senha deve conter letras.");
							} else { // Se não está faltando nenhuma requisição na senha retorna que a senha é válida
								System.out.println("Senha Válida!");
								senhaInvalida = false;
							}
						}
					} else { // Se a senha possue somente letras em minúsculo retorna um aviso sobre
						System.out.println("Sua senha não deve conter somente letras em minúsculo.");
					}
				} else { // Se a senha possue somente letras em maiúsculo retorna um aviso sobre
					System.out.println("Sua senha não deve conter somente letras em maiúsculo.");
				}
			} else { // Se a senha possuir menos de 6 digitos retorna a quantidade de digitos que a senha possue e quantos devem ser adicionados
				System.out.println("Sua senha está com " + entradaSenha.length() + " digitos. Adicionar mínimo de " + (6 - entradaSenha.length()) + " caracteres na sua senha.");
			}
		} while(senhaInvalida); // Repetidor para ler novas senhas enquanto não estiverem válidas
		
		scanner.close(); // Encerra o leitor
	}
}
