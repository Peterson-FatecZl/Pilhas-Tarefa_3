package view_4;

import javax.swing.JOptionPane;

import controller.NPRController;
import model.Pilhaint;

public class Principal_4 {

	public static void main(String[] args) throws Exception {
		Pilhaint pilha = new Pilhaint();
		NPRController calculadora = new NPRController();
		int opcao = 0;

		while (opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Inserir Valor\n2 - Fazer Operação\n9 - Sair", "Insira a Opção desejada", -1));
			switch (opcao) {
			case 1:
				int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor Desejado", "Entrada Numérica", -1));
				calculadora.insereValor(pilha, valor);
				break;
			case 2:
				String operacao = JOptionPane.showInputDialog(null, "Insira a Operação Desejada", "Operação", -1);
				System.out.println(calculadora.npr(pilha, operacao));
				break;
			case 9:
				break;
			default:
				System.err.println("Opção Invalida");
				break;
			}

		}

	}
}
