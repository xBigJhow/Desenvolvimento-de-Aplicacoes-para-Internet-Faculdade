package projeto.tarefa09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages="projeto.tarefa09.model")
@ComponentScan(basePackages=("projeto.*"))
@EnableJpaRepositories(basePackages="projeto.tarefa09.repository")
@EnableTransactionManagement
public class Tarefa09Application {

	public static void main(String[] args) {
		SpringApplication.run(Tarefa09Application.class, args);
	}

}


