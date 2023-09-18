package view;

import model.Pilhaint;

public class Main {

	public static void main(String[] args) throws Exception {

		Pilhaint stackInt = new Pilhaint();
		int[] vetor = { 0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		int soma = 0;
		
		for(int ctd = 0; ctd < vetor.length; ctd++) {
			if(vetor[ctd] >= 0) {
				stackInt.push(vetor[ctd]);
			}else {
				soma += stackInt.pop();
				soma += stackInt.pop();
				
				stackInt.push(vetor[ctd]);
				stackInt.push(soma);
				soma = 0;
			}
		}
		System.out.println(stackInt.size());
	}

}
