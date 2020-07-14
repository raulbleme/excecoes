package br.com.excecoes.implementacao;

import br.com.excecoes.excecoes.Excecao;

public class TesteExcecao {

	public static void main(String[] args) {

		try {
			int x = Integer.parseInt("a");
			System.out.println(x);
			
			String y = null;
			System.out.println(y.length());
			
		}catch(Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
		}finally {
			System.out.println("Até logo.");
		}
	}

}
