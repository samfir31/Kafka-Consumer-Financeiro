package br.com.consumer.financeiro.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class ConexaoSql {	
	
	@Value("${conexao}")
	private String conexao;
	
	@Value("${sql.user}")
    public String user;
	
	@Value("${sql.pass}")
	private String pass;	
	
	@PostConstruct
	public Connection getConexao() {
		try {
			Connection conn = DriverManager.getConnection(
					conexao,
					user,
					pass
					);
			System.out.println("Conectado ao banco de dados");
			return conn;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro de conexão com banco de dados " + e.getMessage());
			return null;
		}	
	}
	
}
