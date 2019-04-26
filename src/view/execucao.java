package view;

import model.Pessoa;

public class execucao {
	
	public static void main(String[] args) {
		// TODO Auto-genereted method stub
		
				
		Pessoa pessoa = new Pessoa();
		
		//PESSOA
		pessoa.setNome("Ezio Pacheco Neto");
		System.out.println(pessoa.getNome());
		
		//ENDEREÇO
		pessoa.setendereco("Avenida Lara Campos");
		System.out.println(pessoa.getendereco());
		
		//CEP
		pessoa.setcep(8041600);
		System.out.println(pessoa.getcep());
		
		//CIDADE
		pessoa.setcidade("Sao Paulo");
		System.out.println(pessoa.getcidade());
		
		//ESTADO
		pessoa.setestado("Sao Paulo");
		System.out.println(pessoa.getestado());
	}
}
