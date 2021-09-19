package br.com.consumer.financeiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import br.com.consumer.financeiro.config.ConexaoSql;
import br.com.consumer.financeiro.services.FinanceiroService;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ExeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExeApplication.class, args);
		//ConexaoSql c = new ConexaoSql();
		//c.getConexao();
		/*FinanceiroService service = new FinanceiroService();
		service.objeto();*/
	}

}
