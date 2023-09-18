package view_5;

import javax.swing.JOptionPane;
import modelo.PilhaStrings;
import controller.HistoricoController;
public class Principal_5 {

	public static void main(String[] args) throws Exception {
		PilhaStrings historico = new PilhaStrings();
		HistoricoController controller = new HistoricoController();
		int opcao = 0;

		while (opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1 - Inserir Novo Endereço no Histórico\n"+
					"2 - Remover o Último Endereço do Histórico\n"+
					"3 - Visualizar Último Endereço do Histórico\n9 - Sair",
					"Insira o Número da Opção desejada", -1));
			switch (opcao) {
			case 1:
				String path = JOptionPane.showInputDialog(null, "Insira o endereço", "Entrada", -1);
				controller.inserirEndereco(historico, path);
				break;
			case 2:
				controller.removerUltimoEndereco(historico);
				break;
			case 3:
				controller.visualizarUltimoEndereco(historico);
				break;
			case 9:
				//Sair
				break;
			default:
				System.err.println("Opção Invalida");
				break;
			}
		}

	}
}