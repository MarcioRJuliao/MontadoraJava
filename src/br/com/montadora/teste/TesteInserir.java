package br.com.montadora.teste;

import java.sql.Connection;

import br.com.montadora.conexao.Conexao;
import br.com.montadora.dao.CarroDAO;
import br.com.montadora.model.Carro;

public class TesteInserir {

	public static void main(String[] args) {

Connection con = Conexao.abrirConexao();
		
		Carro carro = new Carro();
		CarroDAO carrodao = new CarroDAO(con);
		
		carro.setNomeMontadora("Honda");
		carro.setModeloCarro("Civic");
		
		System.out.println(carrodao.inserir(carro));
		
		Conexao.fecharConexao(con);

	}

}
