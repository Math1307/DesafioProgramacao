package br.com.desafios;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Leitor de teclado no console
		boolean senhaInvalida = true;
		do {
			
			System.out.println("Digite uma senha:");
			String entradaSenha = scanner.nextLine(); // L� o que foi digitado e coloca na string

			if(entradaSenha.length() >= 6) { // Verifica se a senha digitada possue mais de 6 digitos
				char[] caracteresSenha = entradaSenha.toCharArray(); // Transforma a senha em um Array de caracteres
				boolean temNumeros = false, temLetras = false, temCaracteresEspeciais = false; // Vari�veis para verificar se possue tudo necess�rio para uma senha v�lida
				int quantidadeNumeros = 0, quantidadeLetras = 0, quantidadeCaracteresEspeciais = 0; // Vari�veis para verificar a quantidade de cada tipo de caractere
				
				for (char caractere: caracteresSenha) {
					if(Character.isDigit(caractere)) { // Verifica se o caractere � um n�mero 
						temNumeros = true;
						quantidadeNumeros++;
					} else if(Character.isLetter(caractere)) { // Verifica se o caractere � uma letra
						temLetras = true;
						quantidadeLetras++;
					} else { // Se o caractere n�o � uma letra e nem um n�mero � identificado como caractere especial
						temCaracteresEspeciais = true;
						quantidadeCaracteresEspeciais++;
					}
				}
				if(!entradaSenha.toUpperCase().equals(entradaSenha)) { // Verifica se as letras n�o est�o todas em min�sculo
					if(!entradaSenha.toLowerCase().equals(entradaSenha)) { // Verifica se as letras n�o est�o todas em mai�sculo
						if(temNumeros && quantidadeNumeros == entradaSenha.length()) { // Verifica se tem n�meros e se a quantidade de n�meros � a mesma quantidade de caracteres totais na senha
							System.out.println("Sua senha n�o deve conter somente n�meros, insira letras e caracteres especiais como: !@#$%^&*()-+");
							System.exit(0);
						} else if (temLetras && quantidadeLetras == entradaSenha.length()) { // Verifica se tem letras e se a quantidade de letras � a mesma quantidade de caracteres totais na senha
							System.out.println("Sua senha n�o deve conter somente letras, insira n�meros e caracteres especiais como: !@#$%^&*()-+");
							System.exit(0);
						} else if (temCaracteresEspeciais && quantidadeCaracteresEspeciais == entradaSenha.length()) { // Verifica se tem caracteres especiais e se a quantidade de caracteres especiais � a mesma quantidade de caracteres totais na senha
							System.out.println("Sua senha n�o deve conter somente caracteres especiais, insira n�meros e letras.");
							System.exit(0);
						} else {
							if(temNumeros && temLetras && !temCaracteresEspeciais) { // Verifica se faltam caracteres especiais na senha
								System.out.println("Sua senha deve conter caracteres especiais como: !@#$%^&*()-+");
							} else if(temLetras && temCaracteresEspeciais && !temNumeros) { // Verifica se faltam n�meros na senha
								System.out.println("Sua senha deve conter n�meros.");
							} else if(temNumeros && temCaracteresEspeciais && !temLetras) { // Verifica se faltam letras na senha
								System.out.println("Sua senha deve conter letras.");
							} else { // Se n�o est� faltando nenhuma requisi��o na senha retorna que a senha � v�lida
								System.out.println("Senha V�lida!");
								senhaInvalida = false;
							}
						}
					} else { // Se a senha possue somente letras em min�sculo retorna um aviso sobre
						System.out.println("Sua senha n�o deve conter somente letras em min�sculo.");
					}
				} else { // Se a senha possue somente letras em mai�sculo retorna um aviso sobre
					System.out.println("Sua senha n�o deve conter somente letras em mai�sculo.");
				}
			} else { // Se a senha possuir menos de 6 digitos retorna a quantidade de digitos que a senha possue e quantos devem ser adicionados
				System.out.println("Sua senha est� com " + entradaSenha.length() + " digitos. Adicionar m�nimo de " + (6 - entradaSenha.length()) + " caracteres na sua senha.");
			}
		} while(senhaInvalida); // Repetidor para ler novas senhas enquanto n�o estiverem v�lidas
		
		scanner.close(); // Encerra o leitor
	}
}
