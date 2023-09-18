package controller;

import model.Pilhaint;

public class NPRController {

	public void insereValor(Pilhaint p, int valor) {
		p.push(valor);
	}

	public int npr(Pilhaint p, String op) throws Exception {
		int resultado;
		if (p.size() >= 2) {

			switch (op) {
			case "+":
				resultado = p.pop();
				resultado += p.pop();
				p.push(resultado);

				return resultado;

			case "-":
				int first = p.pop();
				resultado = p.pop();
				resultado = (resultado - first);
				p.push(resultado);

				return resultado;

			case "*":
				resultado = p.pop();
				resultado *= p.pop();
				p.push(resultado);

				return resultado;

			case "/":
				first = p.pop();
				resultado = p.pop();
				resultado = (resultado / first);
				p.push(resultado);

				return resultado;

			default:
				System.err.println("Operação inválida");
				return 0;
			}
		} else {
			throw new Exception("valores insuficientes");
		}
	}

}
