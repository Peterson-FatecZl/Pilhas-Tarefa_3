package view;

import javax.swing.JOptionPane;

import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) throws Exception {
		PalindromoController controller = new PalindromoController();

		String palavra = JOptionPane.showInputDialog(null, "Insira a Palavra", "Entrada de Palavras", -1);
		String palavrainvertida = controller.invertePalavra(palavra);
		boolean palindromo = controller.comparaPalavras(palavra, palavrainvertida);
		System.out.println(palindromo);
	}

}
