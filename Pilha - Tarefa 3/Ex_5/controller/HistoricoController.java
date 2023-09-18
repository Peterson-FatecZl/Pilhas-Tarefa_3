package controller;

import modelo.PilhaStrings;

public class HistoricoController {

	public HistoricoController() {
		super();
	}

	public PilhaStrings inserirEndereco(PilhaStrings historico, String endereco) throws Exception {
		if (endereco.startsWith("http://www") && endereco.contains(".co")) {

			historico.push(endereco);
			return historico;

		} else {
			throw new Exception("Endereço Não Encontrado");
		}

	}

	public PilhaStrings removerUltimoEndereco(PilhaStrings historico) throws Exception {
		if (historico.isEmpty()) {
			throw new Exception("O Histórico Já Está Vazio");
		} else if (historico.size() == 1) {
			throw new Exception("Não é Possível Desempilhar o Último Endereço do Histórico");
		} else {
			historico.pop();
			return historico;
		}
	}

	public PilhaStrings visualizarUltimoEndereco(PilhaStrings historico) throws Exception {
		if (historico.isEmpty()) {
			throw new Exception("O Histórico Está Vazio");
		} else if (historico.size() == 1) {
			throw new Exception("Não é Possível Exibir o Último Endereço do Histórico");
		} else {
			System.out.println(historico.pop());
			return historico;
		}
	}

}
