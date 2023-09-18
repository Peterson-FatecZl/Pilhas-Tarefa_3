package controller;

import modelo.PilhaStrings;

public class PalindromoController {

	public PalindromoController() {
		super();
	}

	public String invertePalavra(String palavra) throws Exception {
		PilhaStrings pilha = new PilhaStrings();
		StringBuilder palavraInvertida = new StringBuilder();
		String[] vetorDaPalavra = palavra.split("");
		int i = 0;

		while (i < vetorDaPalavra.length) {
			pilha.push(vetorDaPalavra[i]);
			i++;
		}
		while (!pilha.isEmpty()) {
			palavraInvertida.append(pilha.pop());
		}
		String novaPalavra = palavraInvertida.toString();
		return novaPalavra;
	}

	public boolean comparaPalavras(String palavra, String palavraInvertida) {
		if (palavra.equals(palavraInvertida)) {
			return true;
		} else {
			return false;
		}
	}

}
