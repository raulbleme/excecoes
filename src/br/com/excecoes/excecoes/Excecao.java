package br.com.excecoes.excecoes;

public class Excecao {

	public static String tratarExcecao(Exception e) {
		if(e instanceof NumberFormatException) {
			return "N�mero Inv�lido!";
		}
		else if(e instanceof NullPointerException) {
			return "Objeto Nulo!";
		}
		else {
			return "Erro desconhecido.";
		}
	}
}
